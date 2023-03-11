import * as jspb from 'google-protobuf'

import * as fintekkers_models_util_lock_node_partition_pb from '../../../../fintekkers/models/util/lock/node_partition_pb';


export class LockRequestProto extends jspb.Message {
  getObjectClass(): string;
  setObjectClass(value: string): LockRequestProto;

  getVersion(): string;
  setVersion(value: string): LockRequestProto;

  getNodePartition(): fintekkers_models_util_lock_node_partition_pb.NodePartition | undefined;
  setNodePartition(value?: fintekkers_models_util_lock_node_partition_pb.NodePartition): LockRequestProto;
  hasNodePartition(): boolean;
  clearNodePartition(): LockRequestProto;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LockRequestProto.AsObject;
  static toObject(includeInstance: boolean, msg: LockRequestProto): LockRequestProto.AsObject;
  static serializeBinaryToWriter(message: LockRequestProto, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LockRequestProto;
  static deserializeBinaryFromReader(message: LockRequestProto, reader: jspb.BinaryReader): LockRequestProto;
}

export namespace LockRequestProto {
  export type AsObject = {
    objectClass: string,
    version: string,
    nodePartition?: fintekkers_models_util_lock_node_partition_pb.NodePartition.AsObject,
  }
}

