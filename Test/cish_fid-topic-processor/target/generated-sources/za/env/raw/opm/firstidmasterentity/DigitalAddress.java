/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package za.env.raw.opm.firstidmasterentity;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DigitalAddress extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5580497995190624960L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DigitalAddress\",\"namespace\":\"za.env.raw.opm.firstidmasterentity\",\"fields\":[{\"name\":\"digitalAddress\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"digitalAddressEntpsTypeCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DigitalAddress> ENCODER =
      new BinaryMessageEncoder<DigitalAddress>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DigitalAddress> DECODER =
      new BinaryMessageDecoder<DigitalAddress>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DigitalAddress> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DigitalAddress> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DigitalAddress> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DigitalAddress>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DigitalAddress to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DigitalAddress from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DigitalAddress instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DigitalAddress fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String digitalAddress;
  @Deprecated public java.lang.String digitalAddressEntpsTypeCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DigitalAddress() {}

  /**
   * All-args constructor.
   * @param digitalAddress The new value for digitalAddress
   * @param digitalAddressEntpsTypeCode The new value for digitalAddressEntpsTypeCode
   */
  public DigitalAddress(java.lang.String digitalAddress, java.lang.String digitalAddressEntpsTypeCode) {
    this.digitalAddress = digitalAddress;
    this.digitalAddressEntpsTypeCode = digitalAddressEntpsTypeCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return digitalAddress;
    case 1: return digitalAddressEntpsTypeCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: digitalAddress = value$ != null ? value$.toString() : null; break;
    case 1: digitalAddressEntpsTypeCode = value$ != null ? value$.toString() : null; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'digitalAddress' field.
   * @return The value of the 'digitalAddress' field.
   */
  public java.lang.String getDigitalAddress() {
    return digitalAddress;
  }


  /**
   * Sets the value of the 'digitalAddress' field.
   * @param value the value to set.
   */
  public void setDigitalAddress(java.lang.String value) {
    this.digitalAddress = value;
  }

  /**
   * Gets the value of the 'digitalAddressEntpsTypeCode' field.
   * @return The value of the 'digitalAddressEntpsTypeCode' field.
   */
  public java.lang.String getDigitalAddressEntpsTypeCode() {
    return digitalAddressEntpsTypeCode;
  }


  /**
   * Sets the value of the 'digitalAddressEntpsTypeCode' field.
   * @param value the value to set.
   */
  public void setDigitalAddressEntpsTypeCode(java.lang.String value) {
    this.digitalAddressEntpsTypeCode = value;
  }

  /**
   * Creates a new DigitalAddress RecordBuilder.
   * @return A new DigitalAddress RecordBuilder
   */
  public static za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder newBuilder() {
    return new za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder();
  }

  /**
   * Creates a new DigitalAddress RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DigitalAddress RecordBuilder
   */
  public static za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder newBuilder(za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder other) {
    if (other == null) {
      return new za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder();
    } else {
      return new za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder(other);
    }
  }

  /**
   * Creates a new DigitalAddress RecordBuilder by copying an existing DigitalAddress instance.
   * @param other The existing instance to copy.
   * @return A new DigitalAddress RecordBuilder
   */
  public static za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder newBuilder(za.env.raw.opm.firstidmasterentity.DigitalAddress other) {
    if (other == null) {
      return new za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder();
    } else {
      return new za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder(other);
    }
  }

  /**
   * RecordBuilder for DigitalAddress instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DigitalAddress>
    implements org.apache.avro.data.RecordBuilder<DigitalAddress> {

    private java.lang.String digitalAddress;
    private java.lang.String digitalAddressEntpsTypeCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.digitalAddress)) {
        this.digitalAddress = data().deepCopy(fields()[0].schema(), other.digitalAddress);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.digitalAddressEntpsTypeCode)) {
        this.digitalAddressEntpsTypeCode = data().deepCopy(fields()[1].schema(), other.digitalAddressEntpsTypeCode);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing DigitalAddress instance
     * @param other The existing instance to copy.
     */
    private Builder(za.env.raw.opm.firstidmasterentity.DigitalAddress other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.digitalAddress)) {
        this.digitalAddress = data().deepCopy(fields()[0].schema(), other.digitalAddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.digitalAddressEntpsTypeCode)) {
        this.digitalAddressEntpsTypeCode = data().deepCopy(fields()[1].schema(), other.digitalAddressEntpsTypeCode);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'digitalAddress' field.
      * @return The value.
      */
    public java.lang.String getDigitalAddress() {
      return digitalAddress;
    }


    /**
      * Sets the value of the 'digitalAddress' field.
      * @param value The value of 'digitalAddress'.
      * @return This builder.
      */
    public za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder setDigitalAddress(java.lang.String value) {
      validate(fields()[0], value);
      this.digitalAddress = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'digitalAddress' field has been set.
      * @return True if the 'digitalAddress' field has been set, false otherwise.
      */
    public boolean hasDigitalAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'digitalAddress' field.
      * @return This builder.
      */
    public za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder clearDigitalAddress() {
      digitalAddress = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'digitalAddressEntpsTypeCode' field.
      * @return The value.
      */
    public java.lang.String getDigitalAddressEntpsTypeCode() {
      return digitalAddressEntpsTypeCode;
    }


    /**
      * Sets the value of the 'digitalAddressEntpsTypeCode' field.
      * @param value The value of 'digitalAddressEntpsTypeCode'.
      * @return This builder.
      */
    public za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder setDigitalAddressEntpsTypeCode(java.lang.String value) {
      validate(fields()[1], value);
      this.digitalAddressEntpsTypeCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'digitalAddressEntpsTypeCode' field has been set.
      * @return True if the 'digitalAddressEntpsTypeCode' field has been set, false otherwise.
      */
    public boolean hasDigitalAddressEntpsTypeCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'digitalAddressEntpsTypeCode' field.
      * @return This builder.
      */
    public za.env.raw.opm.firstidmasterentity.DigitalAddress.Builder clearDigitalAddressEntpsTypeCode() {
      digitalAddressEntpsTypeCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DigitalAddress build() {
      try {
        DigitalAddress record = new DigitalAddress();
        record.digitalAddress = fieldSetFlags()[0] ? this.digitalAddress : (java.lang.String) defaultValue(fields()[0]);
        record.digitalAddressEntpsTypeCode = fieldSetFlags()[1] ? this.digitalAddressEntpsTypeCode : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DigitalAddress>
    WRITER$ = (org.apache.avro.io.DatumWriter<DigitalAddress>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DigitalAddress>
    READER$ = (org.apache.avro.io.DatumReader<DigitalAddress>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.digitalAddress == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.digitalAddress);
    }

    if (this.digitalAddressEntpsTypeCode == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.digitalAddressEntpsTypeCode);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.digitalAddress = null;
      } else {
        this.digitalAddress = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.digitalAddressEntpsTypeCode = null;
      } else {
        this.digitalAddressEntpsTypeCode = in.readString();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.digitalAddress = null;
          } else {
            this.digitalAddress = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.digitalAddressEntpsTypeCode = null;
          } else {
            this.digitalAddressEntpsTypeCode = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









