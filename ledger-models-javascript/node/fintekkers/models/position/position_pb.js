// source: fintekkers/models/position/position.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = (function() {
  if (this) { return this; }
  if (typeof window !== 'undefined') { return window; }
  if (typeof global !== 'undefined') { return global; }
  if (typeof self !== 'undefined') { return self; }
  return Function('return this')();
}.call(null));

var fintekkers_models_util_decimal_value_pb = require('../../../fintekkers/models/util/decimal_value_pb.js');
goog.object.extend(proto, fintekkers_models_util_decimal_value_pb);
var fintekkers_models_position_measure_pb = require('../../../fintekkers/models/position/measure_pb.js');
goog.object.extend(proto, fintekkers_models_position_measure_pb);
var fintekkers_models_position_position_util_pb = require('../../../fintekkers/models/position/position_util_pb.js');
goog.object.extend(proto, fintekkers_models_position_position_util_pb);
goog.exportSymbol('proto.fintekkers.models.position.MeasureMapFieldEntry', null, global);
goog.exportSymbol('proto.fintekkers.models.position.PositionProto', null, global);
goog.exportSymbol('proto.fintekkers.models.position.PositionTypeProto', null, global);
goog.exportSymbol('proto.fintekkers.models.position.PositionViewProto', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.fintekkers.models.position.MeasureMapFieldEntry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.fintekkers.models.position.MeasureMapFieldEntry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.models.position.MeasureMapFieldEntry.displayName = 'proto.fintekkers.models.position.MeasureMapFieldEntry';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.fintekkers.models.position.PositionProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.fintekkers.models.position.PositionProto.repeatedFields_, null);
};
goog.inherits(proto.fintekkers.models.position.PositionProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.fintekkers.models.position.PositionProto.displayName = 'proto.fintekkers.models.position.PositionProto';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.models.position.MeasureMapFieldEntry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.models.position.MeasureMapFieldEntry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.toObject = function(includeInstance, msg) {
  var f, obj = {
    measure: jspb.Message.getFieldWithDefault(msg, 1, 0),
    measureDecimalValue: (f = msg.getMeasureDecimalValue()) && fintekkers_models_util_decimal_value_pb.DecimalValueProto.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.models.position.MeasureMapFieldEntry;
  return proto.fintekkers.models.position.MeasureMapFieldEntry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.models.position.MeasureMapFieldEntry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.fintekkers.models.position.MeasureProto} */ (reader.readEnum());
      msg.setMeasure(value);
      break;
    case 2:
      var value = new fintekkers_models_util_decimal_value_pb.DecimalValueProto;
      reader.readMessage(value,fintekkers_models_util_decimal_value_pb.DecimalValueProto.deserializeBinaryFromReader);
      msg.setMeasureDecimalValue(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.models.position.MeasureMapFieldEntry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.models.position.MeasureMapFieldEntry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMeasure();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getMeasureDecimalValue();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      fintekkers_models_util_decimal_value_pb.DecimalValueProto.serializeBinaryToWriter
    );
  }
};


/**
 * optional MeasureProto measure = 1;
 * @return {!proto.fintekkers.models.position.MeasureProto}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.getMeasure = function() {
  return /** @type {!proto.fintekkers.models.position.MeasureProto} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.fintekkers.models.position.MeasureProto} value
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry} returns this
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.setMeasure = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional fintekkers.models.util.DecimalValueProto measure_decimal_value = 2;
 * @return {?proto.fintekkers.models.util.DecimalValueProto}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.getMeasureDecimalValue = function() {
  return /** @type{?proto.fintekkers.models.util.DecimalValueProto} */ (
    jspb.Message.getWrapperField(this, fintekkers_models_util_decimal_value_pb.DecimalValueProto, 2));
};


/**
 * @param {?proto.fintekkers.models.util.DecimalValueProto|undefined} value
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry} returns this
*/
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.setMeasureDecimalValue = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry} returns this
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.clearMeasureDecimalValue = function() {
  return this.setMeasureDecimalValue(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.fintekkers.models.position.MeasureMapFieldEntry.prototype.hasMeasureDecimalValue = function() {
  return jspb.Message.getField(this, 2) != null;
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.fintekkers.models.position.PositionProto.repeatedFields_ = [20,21];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.fintekkers.models.position.PositionProto.prototype.toObject = function(opt_includeInstance) {
  return proto.fintekkers.models.position.PositionProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.fintekkers.models.position.PositionProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.position.PositionProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    objectClass: jspb.Message.getFieldWithDefault(msg, 1, ""),
    version: jspb.Message.getFieldWithDefault(msg, 2, ""),
    positionView: jspb.Message.getFieldWithDefault(msg, 10, 0),
    positionType: jspb.Message.getFieldWithDefault(msg, 11, 0),
    measuresList: jspb.Message.toObjectList(msg.getMeasuresList(),
    proto.fintekkers.models.position.MeasureMapFieldEntry.toObject, includeInstance),
    fieldsList: jspb.Message.toObjectList(msg.getFieldsList(),
    fintekkers_models_position_position_util_pb.FieldMapEntry.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.fintekkers.models.position.PositionProto}
 */
proto.fintekkers.models.position.PositionProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.fintekkers.models.position.PositionProto;
  return proto.fintekkers.models.position.PositionProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.fintekkers.models.position.PositionProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.fintekkers.models.position.PositionProto}
 */
proto.fintekkers.models.position.PositionProto.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setObjectClass(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersion(value);
      break;
    case 10:
      var value = /** @type {!proto.fintekkers.models.position.PositionViewProto} */ (reader.readEnum());
      msg.setPositionView(value);
      break;
    case 11:
      var value = /** @type {!proto.fintekkers.models.position.PositionTypeProto} */ (reader.readEnum());
      msg.setPositionType(value);
      break;
    case 20:
      var value = new proto.fintekkers.models.position.MeasureMapFieldEntry;
      reader.readMessage(value,proto.fintekkers.models.position.MeasureMapFieldEntry.deserializeBinaryFromReader);
      msg.addMeasures(value);
      break;
    case 21:
      var value = new fintekkers_models_position_position_util_pb.FieldMapEntry;
      reader.readMessage(value,fintekkers_models_position_position_util_pb.FieldMapEntry.deserializeBinaryFromReader);
      msg.addFields(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.fintekkers.models.position.PositionProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.fintekkers.models.position.PositionProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.fintekkers.models.position.PositionProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.fintekkers.models.position.PositionProto.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getObjectClass();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getVersion();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPositionView();
  if (f !== 0.0) {
    writer.writeEnum(
      10,
      f
    );
  }
  f = message.getPositionType();
  if (f !== 0.0) {
    writer.writeEnum(
      11,
      f
    );
  }
  f = message.getMeasuresList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      20,
      f,
      proto.fintekkers.models.position.MeasureMapFieldEntry.serializeBinaryToWriter
    );
  }
  f = message.getFieldsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      21,
      f,
      fintekkers_models_position_position_util_pb.FieldMapEntry.serializeBinaryToWriter
    );
  }
};


/**
 * optional string object_class = 1;
 * @return {string}
 */
proto.fintekkers.models.position.PositionProto.prototype.getObjectClass = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.setObjectClass = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string version = 2;
 * @return {string}
 */
proto.fintekkers.models.position.PositionProto.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional PositionViewProto position_view = 10;
 * @return {!proto.fintekkers.models.position.PositionViewProto}
 */
proto.fintekkers.models.position.PositionProto.prototype.getPositionView = function() {
  return /** @type {!proto.fintekkers.models.position.PositionViewProto} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {!proto.fintekkers.models.position.PositionViewProto} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.setPositionView = function(value) {
  return jspb.Message.setProto3EnumField(this, 10, value);
};


/**
 * optional PositionTypeProto position_type = 11;
 * @return {!proto.fintekkers.models.position.PositionTypeProto}
 */
proto.fintekkers.models.position.PositionProto.prototype.getPositionType = function() {
  return /** @type {!proto.fintekkers.models.position.PositionTypeProto} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {!proto.fintekkers.models.position.PositionTypeProto} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.setPositionType = function(value) {
  return jspb.Message.setProto3EnumField(this, 11, value);
};


/**
 * repeated MeasureMapFieldEntry measures = 20;
 * @return {!Array<!proto.fintekkers.models.position.MeasureMapFieldEntry>}
 */
proto.fintekkers.models.position.PositionProto.prototype.getMeasuresList = function() {
  return /** @type{!Array<!proto.fintekkers.models.position.MeasureMapFieldEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.fintekkers.models.position.MeasureMapFieldEntry, 20));
};


/**
 * @param {!Array<!proto.fintekkers.models.position.MeasureMapFieldEntry>} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
*/
proto.fintekkers.models.position.PositionProto.prototype.setMeasuresList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 20, value);
};


/**
 * @param {!proto.fintekkers.models.position.MeasureMapFieldEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.position.MeasureMapFieldEntry}
 */
proto.fintekkers.models.position.PositionProto.prototype.addMeasures = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 20, opt_value, proto.fintekkers.models.position.MeasureMapFieldEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.clearMeasuresList = function() {
  return this.setMeasuresList([]);
};


/**
 * repeated FieldMapEntry fields = 21;
 * @return {!Array<!proto.fintekkers.models.position.FieldMapEntry>}
 */
proto.fintekkers.models.position.PositionProto.prototype.getFieldsList = function() {
  return /** @type{!Array<!proto.fintekkers.models.position.FieldMapEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, fintekkers_models_position_position_util_pb.FieldMapEntry, 21));
};


/**
 * @param {!Array<!proto.fintekkers.models.position.FieldMapEntry>} value
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
*/
proto.fintekkers.models.position.PositionProto.prototype.setFieldsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 21, value);
};


/**
 * @param {!proto.fintekkers.models.position.FieldMapEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.fintekkers.models.position.FieldMapEntry}
 */
proto.fintekkers.models.position.PositionProto.prototype.addFields = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 21, opt_value, proto.fintekkers.models.position.FieldMapEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.fintekkers.models.position.PositionProto} returns this
 */
proto.fintekkers.models.position.PositionProto.prototype.clearFieldsList = function() {
  return this.setFieldsList([]);
};


/**
 * @enum {number}
 */
proto.fintekkers.models.position.PositionViewProto = {
  UNKNOWN_POSITION_VIEW: 0,
  DEFAULT_VIEW: 1,
  STRATEGY_VIEW: 2
};

/**
 * @enum {number}
 */
proto.fintekkers.models.position.PositionTypeProto = {
  UNKNOWN_POSITION_TYPE: 0,
  TRANSACTION: 1,
  TAX_LOT: 2
};

goog.object.extend(exports, proto.fintekkers.models.position);