package za.co.fnb.cish.fid.zos.loader.security.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Security;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class JWTService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JWTService.class);

    private final PrivateKey privateKey;
    private final String typ = "JWT";
    private final String kid;
    private final String iss;
    private final String aud;
    private final int expSeconds;
    private final String pkPath;

    public JWTService(String url, String kid, String iss, int expSeconds, String pkPath) throws IOException {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        this.kid = kid;
        this.iss = iss;
        this.expSeconds = expSeconds;
        this.pkPath = pkPath;
        this.privateKey = getPrivateKeyPair().getPrivate();
        this.aud = url;
        LOGGER.info("aud={}, type={}, kid={}, iss={}, exp={}", this.aud, this.typ, this.kid, this.iss, this.expSeconds);
    }

    protected KeyPair getPrivateKeyPair() throws IOException {
        JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");
        //InputStream inputStream = this.getClass().getResourceAsStream("/GatewayPK.pem");
        InputStream inputStream = this.getClass().getResourceAsStream(pkPath);
        PEMParser pemParser = new PEMParser(new InputStreamReader(inputStream));
        PEMKeyPair pemKeyPair = (PEMKeyPair) pemParser.readObject();

        return converter.getKeyPair(pemKeyPair);
    }

    public String generateJwtToken() {
        String uuid = UUID.randomUUID().toString();
        JwtBuilder jwtBuilder = Jwts.builder().setHeaderParam("typ", this.typ).setHeaderParam("kid", this.kid).claim("iss", this.iss).claim("jti", uuid).claim("aud", aud).claim("exp", Instant.now().plus(this.expSeconds, ChronoUnit.SECONDS).getEpochSecond());
        String token = jwtBuilder.signWith(this.privateKey, SignatureAlgorithm.RS256).compact();
        LOGGER.debug("generateJwtToken for uuid={}, token=\n[{}]", uuid, token);

        return token;
    }

}
