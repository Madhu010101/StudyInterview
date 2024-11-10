#!/bin/bash

USER=$krb_user
PASSWD=$krb_pass
ENC='rc4-hmac'
ENC_TYPES=$ENC
KVNO=1
keytab_loc=/opt/app/keytab
KEYTAB_OUT=${keytab_loc}/${USER}.keytab
PERIOD_SECONDS=3600

mkdir -p $keytab_loc

kdestroy

SLEEP=1   # ADD THIS LINE PLEASE !!!!!!!!!!!!!!
# Export password to keytab
IFS=' ' read -a ENC_ARR <<< "$ENC_TYPES"
{
 for ENC in "${ENC_ARR[@]}"
 do
 echo "addent -password -p $USER -k $KVNO -e $ENC"
 if [ $SLEEP -eq 1 ]; then
 sleep 1
 fi
 echo "$PASSWD"
 done
 echo "wkt $KEYTAB_OUT"
} | ktutil

kinit ${USER}@FNB.CO.ZA -k -t ${keytab_loc}/${USER}.keytab
klist

sleep 2

cat <<EOF > /opt/app/kerb-refresh.sh
#!/bin/bash

kinit -r7d -l24h  ${USER}@FNB.CO.ZA -k -t ${keytab_loc}/${USER}.keytab
EOF

chmod a+x /opt/app/kerb-refresh.sh


( crontab -l | grep -v -F "*/8 * * * * /opt/app/kerb-refresh.sh" ; echo "*/8 * * * * /opt/app/kerb-refresh.sh" ) | crontab -