// source: fintekkers/models/security/coupon_frequency.proto
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
var global =
    (typeof globalThis !== 'undefined' && globalThis) ||
    (typeof window !== 'undefined' && window) ||
    (typeof global !== 'undefined' && global) ||
    (typeof self !== 'undefined' && self) ||
    (function () { return this; }).call(null) ||
    Function('return this')();

goog.exportSymbol('proto.fintekkers.models.security.CouponFrequencyProto', null, global);
/**
 * @enum {number}
 */
proto.fintekkers.models.security.CouponFrequencyProto = {
  UNKNOWN_COUPON_FREQUENCY: 0,
  ANNUALLY: 1,
  SEMIANNUALLY: 2,
  QUARTERLY: 3,
  MONTHLY: 4,
  NO_COUPON: 5
};

goog.object.extend(exports, proto.fintekkers.models.security);
