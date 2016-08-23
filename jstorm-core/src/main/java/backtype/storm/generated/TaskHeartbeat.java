/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-22")
public class TaskHeartbeat implements org.apache.thrift.TBase<TaskHeartbeat, TaskHeartbeat._Fields>, java.io.Serializable, Cloneable, Comparable<TaskHeartbeat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskHeartbeat");

  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UPTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("uptime", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskHeartbeatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskHeartbeatTupleSchemeFactory());
  }

  private int time; // required
  private int uptime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIME((short)1, "time"),
    UPTIME((short)2, "uptime");

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
        case 1: // TIME
          return TIME;
        case 2: // UPTIME
          return UPTIME;
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
  private static final int __TIME_ISSET_ID = 0;
  private static final int __UPTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UPTIME, new org.apache.thrift.meta_data.FieldMetaData("uptime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskHeartbeat.class, metaDataMap);
  }

  public TaskHeartbeat() {
  }

  public TaskHeartbeat(
    int time,
    int uptime)
  {
    this();
    this.time = time;
    set_time_isSet(true);
    this.uptime = uptime;
    set_uptime_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskHeartbeat(TaskHeartbeat other) {
    __isset_bitfield = other.__isset_bitfield;
    this.time = other.time;
    this.uptime = other.uptime;
  }

  public TaskHeartbeat deepCopy() {
    return new TaskHeartbeat(this);
  }

  @Override
  public void clear() {
    set_time_isSet(false);
    this.time = 0;
    set_uptime_isSet(false);
    this.uptime = 0;
  }

  public int get_time() {
    return this.time;
  }

  public void set_time(int time) {
    this.time = time;
    set_time_isSet(true);
  }

  public void unset_time() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean is_set_time() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void set_time_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public int get_uptime() {
    return this.uptime;
  }

  public void set_uptime(int uptime) {
    this.uptime = uptime;
    set_uptime_isSet(true);
  }

  public void unset_uptime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPTIME_ISSET_ID);
  }

  /** Returns true if field uptime is set (has been assigned a value) and false otherwise */
  public boolean is_set_uptime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPTIME_ISSET_ID);
  }

  public void set_uptime_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIME:
      if (value == null) {
        unset_time();
      } else {
        set_time((Integer)value);
      }
      break;

    case UPTIME:
      if (value == null) {
        unset_uptime();
      } else {
        set_uptime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIME:
      return Integer.valueOf(get_time());

    case UPTIME:
      return Integer.valueOf(get_uptime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIME:
      return is_set_time();
    case UPTIME:
      return is_set_uptime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskHeartbeat)
      return this.equals((TaskHeartbeat)that);
    return false;
  }

  public boolean equals(TaskHeartbeat that) {
    if (that == null)
      return false;

    boolean this_present_time = true;
    boolean that_present_time = true;
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    boolean this_present_uptime = true;
    boolean that_present_uptime = true;
    if (this_present_uptime || that_present_uptime) {
      if (!(this_present_uptime && that_present_uptime))
        return false;
      if (this.uptime != that.uptime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_time = true;
    list.add(present_time);
    if (present_time)
      list.add(time);

    boolean present_uptime = true;
    list.add(present_uptime);
    if (present_uptime)
      list.add(uptime);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskHeartbeat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_time()).compareTo(other.is_set_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_uptime()).compareTo(other.is_set_uptime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uptime, other.uptime);
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
    StringBuilder sb = new StringBuilder("TaskHeartbeat(");
    boolean first = true;

    sb.append("time:");
    sb.append(this.time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime:");
    sb.append(this.uptime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time' is unset! Struct:" + toString());
    }

    if (!is_set_uptime()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uptime' is unset! Struct:" + toString());
    }

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

  private static class TaskHeartbeatStandardSchemeFactory implements SchemeFactory {
    public TaskHeartbeatStandardScheme getScheme() {
      return new TaskHeartbeatStandardScheme();
    }
  }

  private static class TaskHeartbeatStandardScheme extends StandardScheme<TaskHeartbeat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskHeartbeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time = iprot.readI32();
              struct.set_time_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPTIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uptime = iprot.readI32();
              struct.set_uptime_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskHeartbeat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI32(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPTIME_FIELD_DESC);
      oprot.writeI32(struct.uptime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskHeartbeatTupleSchemeFactory implements SchemeFactory {
    public TaskHeartbeatTupleScheme getScheme() {
      return new TaskHeartbeatTupleScheme();
    }
  }

  private static class TaskHeartbeatTupleScheme extends TupleScheme<TaskHeartbeat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.time);
      oprot.writeI32(struct.uptime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskHeartbeat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.time = iprot.readI32();
      struct.set_time_isSet(true);
      struct.uptime = iprot.readI32();
      struct.set_uptime_isSet(true);
    }
  }

}
