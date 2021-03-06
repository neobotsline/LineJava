/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FriendChannelMatricesResponse implements org.apache.thrift.TBase<FriendChannelMatricesResponse, FriendChannelMatricesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FriendChannelMatricesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FriendChannelMatricesResponse");

  private static final org.apache.thrift.protocol.TField EXPIRES_FIELD_DESC = new org.apache.thrift.protocol.TField("expires", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MATRICES_FIELD_DESC = new org.apache.thrift.protocol.TField("matrices", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FriendChannelMatricesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FriendChannelMatricesResponseTupleSchemeFactory());
  }

  public long expires; // required
  public List<FriendChannelMatrix> matrices; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPIRES((short)1, "expires"),
    MATRICES((short)2, "matrices");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXPIRES
          return EXPIRES;
        case 2: // MATRICES
          return MATRICES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EXPIRES_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPIRES, new org.apache.thrift.meta_data.FieldMetaData("expires", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MATRICES, new org.apache.thrift.meta_data.FieldMetaData("matrices", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FriendChannelMatrix.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FriendChannelMatricesResponse.class, metaDataMap);
  }

  public FriendChannelMatricesResponse() {
  }

  public FriendChannelMatricesResponse(
    long expires,
    List<FriendChannelMatrix> matrices)
  {
    this();
    this.expires = expires;
    setExpiresIsSet(true);
    this.matrices = matrices;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendChannelMatricesResponse(FriendChannelMatricesResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.expires = other.expires;
    if (other.isSetMatrices()) {
      List<FriendChannelMatrix> __this__matrices = new ArrayList<FriendChannelMatrix>(other.matrices.size());
      for (FriendChannelMatrix other_element : other.matrices) {
        __this__matrices.add(new FriendChannelMatrix(other_element));
      }
      this.matrices = __this__matrices;
    }
  }

  public FriendChannelMatricesResponse deepCopy() {
    return new FriendChannelMatricesResponse(this);
  }

  @Override
  public void clear() {
    setExpiresIsSet(false);
    this.expires = 0;
    this.matrices = null;
  }

  public long getExpires() {
    return this.expires;
  }

  public FriendChannelMatricesResponse setExpires(long expires) {
    this.expires = expires;
    setExpiresIsSet(true);
    return this;
  }

  public void unsetExpires() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  /** Returns true if field expires is set (has been assigned a value) and false otherwise */
  public boolean isSetExpires() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPIRES_ISSET_ID);
  }

  public void setExpiresIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPIRES_ISSET_ID, value);
  }

  public int getMatricesSize() {
    return (this.matrices == null) ? 0 : this.matrices.size();
  }

  public java.util.Iterator<FriendChannelMatrix> getMatricesIterator() {
    return (this.matrices == null) ? null : this.matrices.iterator();
  }

  public void addToMatrices(FriendChannelMatrix elem) {
    if (this.matrices == null) {
      this.matrices = new ArrayList<FriendChannelMatrix>();
    }
    this.matrices.add(elem);
  }

  public List<FriendChannelMatrix> getMatrices() {
    return this.matrices;
  }

  public FriendChannelMatricesResponse setMatrices(List<FriendChannelMatrix> matrices) {
    this.matrices = matrices;
    return this;
  }

  public void unsetMatrices() {
    this.matrices = null;
  }

  /** Returns true if field matrices is set (has been assigned a value) and false otherwise */
  public boolean isSetMatrices() {
    return this.matrices != null;
  }

  public void setMatricesIsSet(boolean value) {
    if (!value) {
      this.matrices = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPIRES:
      if (value == null) {
        unsetExpires();
      } else {
        setExpires((Long)value);
      }
      break;

    case MATRICES:
      if (value == null) {
        unsetMatrices();
      } else {
        setMatrices((List<FriendChannelMatrix>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPIRES:
      return Long.valueOf(getExpires());

    case MATRICES:
      return getMatrices();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPIRES:
      return isSetExpires();
    case MATRICES:
      return isSetMatrices();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FriendChannelMatricesResponse)
      return this.equals((FriendChannelMatricesResponse)that);
    return false;
  }

  public boolean equals(FriendChannelMatricesResponse that) {
    if (that == null)
      return false;

    boolean this_present_expires = true;
    boolean that_present_expires = true;
    if (this_present_expires || that_present_expires) {
      if (!(this_present_expires && that_present_expires))
        return false;
      if (this.expires != that.expires)
        return false;
    }

    boolean this_present_matrices = true && this.isSetMatrices();
    boolean that_present_matrices = true && that.isSetMatrices();
    if (this_present_matrices || that_present_matrices) {
      if (!(this_present_matrices && that_present_matrices))
        return false;
      if (!this.matrices.equals(that.matrices))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(FriendChannelMatricesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExpires()).compareTo(other.isSetExpires());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpires()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expires, other.expires);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMatrices()).compareTo(other.isSetMatrices());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMatrices()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.matrices, other.matrices);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FriendChannelMatricesResponse(");
    boolean first = true;

    sb.append("expires:");
    sb.append(this.expires);
    first = false;
    if (!first) sb.append(", ");
    sb.append("matrices:");
    if (this.matrices == null) {
      sb.append("null");
    } else {
      sb.append(this.matrices);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FriendChannelMatricesResponseStandardSchemeFactory implements SchemeFactory {
    public FriendChannelMatricesResponseStandardScheme getScheme() {
      return new FriendChannelMatricesResponseStandardScheme();
    }
  }

  private static class FriendChannelMatricesResponseStandardScheme extends StandardScheme<FriendChannelMatricesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPIRES
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expires = iprot.readI64();
              struct.setExpiresIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MATRICES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list152 = iprot.readListBegin();
                struct.matrices = new ArrayList<FriendChannelMatrix>(_list152.size);
                for (int _i153 = 0; _i153 < _list152.size; ++_i153)
                {
                  FriendChannelMatrix _elem154;
                  _elem154 = new FriendChannelMatrix();
                  _elem154.read(iprot);
                  struct.matrices.add(_elem154);
                }
                iprot.readListEnd();
              }
              struct.setMatricesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EXPIRES_FIELD_DESC);
      oprot.writeI64(struct.expires);
      oprot.writeFieldEnd();
      if (struct.matrices != null) {
        oprot.writeFieldBegin(MATRICES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.matrices.size()));
          for (FriendChannelMatrix _iter155 : struct.matrices)
          {
            _iter155.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FriendChannelMatricesResponseTupleSchemeFactory implements SchemeFactory {
    public FriendChannelMatricesResponseTupleScheme getScheme() {
      return new FriendChannelMatricesResponseTupleScheme();
    }
  }

  private static class FriendChannelMatricesResponseTupleScheme extends TupleScheme<FriendChannelMatricesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExpires()) {
        optionals.set(0);
      }
      if (struct.isSetMatrices()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExpires()) {
        oprot.writeI64(struct.expires);
      }
      if (struct.isSetMatrices()) {
        {
          oprot.writeI32(struct.matrices.size());
          for (FriendChannelMatrix _iter156 : struct.matrices)
          {
            _iter156.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatricesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.expires = iprot.readI64();
        struct.setExpiresIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list157 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.matrices = new ArrayList<FriendChannelMatrix>(_list157.size);
          for (int _i158 = 0; _i158 < _list157.size; ++_i158)
          {
            FriendChannelMatrix _elem159;
            _elem159 = new FriendChannelMatrix();
            _elem159.read(iprot);
            struct.matrices.add(_elem159);
          }
        }
        struct.setMatricesIsSet(true);
      }
    }
  }

}

