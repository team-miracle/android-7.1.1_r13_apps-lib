// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.android.usbtuner.data;

// @@protoc_insertion_point(imports_scope)

@SuppressWarnings("hiding")
public interface Channel {

  // enum TunerType
  public static final int TYPE_TUNER = 0;
  public static final int TYPE_FILE = 1;

  // enum VideoStreamType
  public static final int MPEG1 = 1;
  public static final int MPEG2 = 2;
  public static final int H263 = 16;
  public static final int H264 = 27;
  public static final int H265 = 36;

  // enum AudioStreamType
  public static final int MPEG1AUDIO = 3;
  public static final int MPEG2AUDIO = 4;
  public static final int MPEG2AACAUDIO = 15;
  public static final int MPEG4LATMAACAUDIO = 17;
  public static final int A52AC3AUDIO = 129;
  public static final int EAC3AUDIO = 135;

  // enum AtscServiceType
  public static final int SERVICE_TYPE_ATSC_RESERVED = 0;
  public static final int SERVICE_TYPE_ANALOG_TELEVISION_CHANNELS = 1;
  public static final int SERVICE_TYPE_ATSC_DIGITAL_TELEVISION = 2;
  public static final int SERVICE_TYPE_ATSC_AUDIO = 3;
  public static final int SERVICE_TYPE_ATSC_DATA_ONLY_SERVICE = 4;
  public static final int SERVICE_TYPE_SOFTWARE_DOWNLOAD = 5;
  public static final int SERVICE_TYPE_UNASSOCIATED_SMALL_SCREEN_SERVICE = 6;
  public static final int SERVICE_TYPE_PARAMETERIZED_SERVICE = 7;
  public static final int SERVICE_TYPE_ATSC_NRT_SERVICE = 8;
  public static final int SERVICE_TYPE_EXTENDED_PARAMERTERIZED_SERVICE = 9;

  public static final class TunerChannelProto extends
      com.google.protobuf.nano.MessageNano {

    private static volatile TunerChannelProto[] _emptyArray;
    public static TunerChannelProto[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new TunerChannelProto[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .com.android.usbtuner.data.TunerType type = 1;
    public int type;

    // optional string short_name = 2;
    public java.lang.String shortName;

    // optional string long_name = 3;
    public java.lang.String longName;

    // optional int32 frequency = 4;
    public int frequency;

    // optional string modulation = 5;
    public java.lang.String modulation;

    // optional string filepath = 6;
    public java.lang.String filepath;

    // optional int32 program_number = 7;
    public int programNumber;

    // optional int32 virtual_major = 8;
    public int virtualMajor;

    // optional int32 virtual_minor = 9;
    public int virtualMinor;

    // optional int64 channel_id = 10;
    public long channelId;

    // optional string description = 11;
    public java.lang.String description;

    // optional int32 tsid = 12;
    public int tsid;

    // optional int32 video_pid = 13;
    public int videoPid;

    // optional .com.android.usbtuner.data.VideoStreamType video_stream_type = 14;
    public int videoStreamType;

    // optional int32 pcr_pid = 15;
    public int pcrPid;

    // repeated .com.android.usbtuner.data.AtscAudioTrack audio_tracks = 16;
    public com.android.usbtuner.data.Track.AtscAudioTrack[] audioTracks;

    // repeated int32 audio_pids = 17;
    public int[] audioPids;

    // repeated .com.android.usbtuner.data.AudioStreamType audio_stream_types = 18;
    public int[] audioStreamTypes;

    // optional int32 audio_track_index = 19;
    public int audioTrackIndex;

    // repeated .com.android.usbtuner.data.AtscCaptionTrack caption_tracks = 20;
    public com.android.usbtuner.data.Track.AtscCaptionTrack[] captionTracks;

    // optional bool has_caption_track = 21;
    public boolean hasCaptionTrack;

    // optional .com.android.usbtuner.data.AtscServiceType service_type = 22 [default = SERVICE_TYPE_ATSC_DIGITAL_TELEVISION];
    public int serviceType;

    // @@protoc_insertion_point(class_scope:com.android.usbtuner.data.TunerChannelProto)

    public TunerChannelProto() {
      clear();
    }

    public TunerChannelProto clear() {
      type = com.android.usbtuner.data.Channel.TYPE_TUNER;
      shortName = "";
      longName = "";
      frequency = 0;
      modulation = "";
      filepath = "";
      programNumber = 0;
      virtualMajor = 0;
      virtualMinor = 0;
      channelId = 0L;
      description = "";
      tsid = 0;
      videoPid = 0;
      videoStreamType = com.android.usbtuner.data.Channel.MPEG1;
      pcrPid = 0;
      audioTracks = com.android.usbtuner.data.Track.AtscAudioTrack.emptyArray();
      audioPids = com.google.protobuf.nano.WireFormatNano.EMPTY_INT_ARRAY;
      audioStreamTypes = com.google.protobuf.nano.WireFormatNano.EMPTY_INT_ARRAY;
      audioTrackIndex = 0;
      captionTracks = com.android.usbtuner.data.Track.AtscCaptionTrack.emptyArray();
      hasCaptionTrack = false;
      serviceType = com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_DIGITAL_TELEVISION;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.type != com.android.usbtuner.data.Channel.TYPE_TUNER) {
        output.writeInt32(1, this.type);
      }
      if (!this.shortName.equals("")) {
        output.writeString(2, this.shortName);
      }
      if (!this.longName.equals("")) {
        output.writeString(3, this.longName);
      }
      if (this.frequency != 0) {
        output.writeInt32(4, this.frequency);
      }
      if (!this.modulation.equals("")) {
        output.writeString(5, this.modulation);
      }
      if (!this.filepath.equals("")) {
        output.writeString(6, this.filepath);
      }
      if (this.programNumber != 0) {
        output.writeInt32(7, this.programNumber);
      }
      if (this.virtualMajor != 0) {
        output.writeInt32(8, this.virtualMajor);
      }
      if (this.virtualMinor != 0) {
        output.writeInt32(9, this.virtualMinor);
      }
      if (this.channelId != 0L) {
        output.writeInt64(10, this.channelId);
      }
      if (!this.description.equals("")) {
        output.writeString(11, this.description);
      }
      if (this.tsid != 0) {
        output.writeInt32(12, this.tsid);
      }
      if (this.videoPid != 0) {
        output.writeInt32(13, this.videoPid);
      }
      if (this.videoStreamType != com.android.usbtuner.data.Channel.MPEG1) {
        output.writeInt32(14, this.videoStreamType);
      }
      if (this.pcrPid != 0) {
        output.writeInt32(15, this.pcrPid);
      }
      if (this.audioTracks != null && this.audioTracks.length > 0) {
        for (int i = 0; i < this.audioTracks.length; i++) {
          com.android.usbtuner.data.Track.AtscAudioTrack element = this.audioTracks[i];
          if (element != null) {
            output.writeMessage(16, element);
          }
        }
      }
      if (this.audioPids != null && this.audioPids.length > 0) {
        for (int i = 0; i < this.audioPids.length; i++) {
          output.writeInt32(17, this.audioPids[i]);
        }
      }
      if (this.audioStreamTypes != null && this.audioStreamTypes.length > 0) {
        for (int i = 0; i < this.audioStreamTypes.length; i++) {
          output.writeInt32(18, this.audioStreamTypes[i]);
        }
      }
      if (this.audioTrackIndex != 0) {
        output.writeInt32(19, this.audioTrackIndex);
      }
      if (this.captionTracks != null && this.captionTracks.length > 0) {
        for (int i = 0; i < this.captionTracks.length; i++) {
          com.android.usbtuner.data.Track.AtscCaptionTrack element = this.captionTracks[i];
          if (element != null) {
            output.writeMessage(20, element);
          }
        }
      }
      if (this.hasCaptionTrack != false) {
        output.writeBool(21, this.hasCaptionTrack);
      }
      if (this.serviceType != com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_DIGITAL_TELEVISION) {
        output.writeInt32(22, this.serviceType);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.type != com.android.usbtuner.data.Channel.TYPE_TUNER) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.type);
      }
      if (!this.shortName.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(2, this.shortName);
      }
      if (!this.longName.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(3, this.longName);
      }
      if (this.frequency != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(4, this.frequency);
      }
      if (!this.modulation.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(5, this.modulation);
      }
      if (!this.filepath.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(6, this.filepath);
      }
      if (this.programNumber != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(7, this.programNumber);
      }
      if (this.virtualMajor != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(8, this.virtualMajor);
      }
      if (this.virtualMinor != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(9, this.virtualMinor);
      }
      if (this.channelId != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(10, this.channelId);
      }
      if (!this.description.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(11, this.description);
      }
      if (this.tsid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(12, this.tsid);
      }
      if (this.videoPid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(13, this.videoPid);
      }
      if (this.videoStreamType != com.android.usbtuner.data.Channel.MPEG1) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(14, this.videoStreamType);
      }
      if (this.pcrPid != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(15, this.pcrPid);
      }
      if (this.audioTracks != null && this.audioTracks.length > 0) {
        for (int i = 0; i < this.audioTracks.length; i++) {
          com.android.usbtuner.data.Track.AtscAudioTrack element = this.audioTracks[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(16, element);
          }
        }
      }
      if (this.audioPids != null && this.audioPids.length > 0) {
        int dataSize = 0;
        for (int i = 0; i < this.audioPids.length; i++) {
          int element = this.audioPids[i];
          dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 2 * this.audioPids.length;
      }
      if (this.audioStreamTypes != null && this.audioStreamTypes.length > 0) {
        int dataSize = 0;
        for (int i = 0; i < this.audioStreamTypes.length; i++) {
          int element = this.audioStreamTypes[i];
          dataSize += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 2 * this.audioStreamTypes.length;
      }
      if (this.audioTrackIndex != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(19, this.audioTrackIndex);
      }
      if (this.captionTracks != null && this.captionTracks.length > 0) {
        for (int i = 0; i < this.captionTracks.length; i++) {
          com.android.usbtuner.data.Track.AtscCaptionTrack element = this.captionTracks[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(20, element);
          }
        }
      }
      if (this.hasCaptionTrack != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(21, this.hasCaptionTrack);
      }
      if (this.serviceType != com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_DIGITAL_TELEVISION) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(22, this.serviceType);
      }
      return size;
    }

    @Override
    public TunerChannelProto mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case com.android.usbtuner.data.Channel.TYPE_TUNER:
              case com.android.usbtuner.data.Channel.TYPE_FILE:
                this.type = value;
                break;
            }
            break;
          }
          case 18: {
            this.shortName = input.readString();
            break;
          }
          case 26: {
            this.longName = input.readString();
            break;
          }
          case 32: {
            this.frequency = input.readInt32();
            break;
          }
          case 42: {
            this.modulation = input.readString();
            break;
          }
          case 50: {
            this.filepath = input.readString();
            break;
          }
          case 56: {
            this.programNumber = input.readInt32();
            break;
          }
          case 64: {
            this.virtualMajor = input.readInt32();
            break;
          }
          case 72: {
            this.virtualMinor = input.readInt32();
            break;
          }
          case 80: {
            this.channelId = input.readInt64();
            break;
          }
          case 90: {
            this.description = input.readString();
            break;
          }
          case 96: {
            this.tsid = input.readInt32();
            break;
          }
          case 104: {
            this.videoPid = input.readInt32();
            break;
          }
          case 112: {
            int value = input.readInt32();
            switch (value) {
              case com.android.usbtuner.data.Channel.MPEG1:
              case com.android.usbtuner.data.Channel.MPEG2:
              case com.android.usbtuner.data.Channel.H263:
              case com.android.usbtuner.data.Channel.H264:
              case com.android.usbtuner.data.Channel.H265:
                this.videoStreamType = value;
                break;
            }
            break;
          }
          case 120: {
            this.pcrPid = input.readInt32();
            break;
          }
          case 130: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 130);
            int i = this.audioTracks == null ? 0 : this.audioTracks.length;
            com.android.usbtuner.data.Track.AtscAudioTrack[] newArray =
                new com.android.usbtuner.data.Track.AtscAudioTrack[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.audioTracks, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.android.usbtuner.data.Track.AtscAudioTrack();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.android.usbtuner.data.Track.AtscAudioTrack();
            input.readMessage(newArray[i]);
            this.audioTracks = newArray;
            break;
          }
          case 136: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 136);
            int i = this.audioPids == null ? 0 : this.audioPids.length;
            int[] newArray = new int[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.audioPids, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = input.readInt32();
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = input.readInt32();
            this.audioPids = newArray;
            break;
          }
          case 138: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            // First pass to compute array length.
            int arrayLength = 0;
            int startPos = input.getPosition();
            while (input.getBytesUntilLimit() > 0) {
              input.readInt32();
              arrayLength++;
            }
            input.rewindToPosition(startPos);
            int i = this.audioPids == null ? 0 : this.audioPids.length;
            int[] newArray = new int[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.audioPids, 0, newArray, 0, i);
            }
            for (; i < newArray.length; i++) {
              newArray[i] = input.readInt32();
            }
            this.audioPids = newArray;
            input.popLimit(limit);
            break;
          }
          case 144: {
            int length = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 144);
            int[] validValues = new int[length];
            int validCount = 0;
            for (int i = 0; i < length; i++) {
              if (i != 0) { // tag for first value already consumed.
                input.readTag();
              }
              int value = input.readInt32();
              switch (value) {
                case com.android.usbtuner.data.Channel.MPEG1AUDIO:
                case com.android.usbtuner.data.Channel.MPEG2AUDIO:
                case com.android.usbtuner.data.Channel.MPEG2AACAUDIO:
                case com.android.usbtuner.data.Channel.MPEG4LATMAACAUDIO:
                case com.android.usbtuner.data.Channel.A52AC3AUDIO:
                case com.android.usbtuner.data.Channel.EAC3AUDIO:
                  validValues[validCount++] = value;
                  break;
              }
            }
            if (validCount != 0) {
              int i = this.audioStreamTypes == null ? 0 : this.audioStreamTypes.length;
              if (i == 0 && validCount == validValues.length) {
                this.audioStreamTypes = validValues;
              } else {
                int[] newArray = new int[i + validCount];
                if (i != 0) {
                  java.lang.System.arraycopy(this.audioStreamTypes, 0, newArray, 0, i);
                }
                java.lang.System.arraycopy(validValues, 0, newArray, i, validCount);
                this.audioStreamTypes = newArray;
              }
            }
            break;
          }
          case 146: {
            int bytes = input.readRawVarint32();
            int limit = input.pushLimit(bytes);
            // First pass to compute array length.
            int arrayLength = 0;
            int startPos = input.getPosition();
            while (input.getBytesUntilLimit() > 0) {
              switch (input.readInt32()) {
                case com.android.usbtuner.data.Channel.MPEG1AUDIO:
                case com.android.usbtuner.data.Channel.MPEG2AUDIO:
                case com.android.usbtuner.data.Channel.MPEG2AACAUDIO:
                case com.android.usbtuner.data.Channel.MPEG4LATMAACAUDIO:
                case com.android.usbtuner.data.Channel.A52AC3AUDIO:
                case com.android.usbtuner.data.Channel.EAC3AUDIO:
                  arrayLength++;
                  break;
              }
            }
            if (arrayLength != 0) {
              input.rewindToPosition(startPos);
              int i = this.audioStreamTypes == null ? 0 : this.audioStreamTypes.length;
              int[] newArray = new int[i + arrayLength];
              if (i != 0) {
                java.lang.System.arraycopy(this.audioStreamTypes, 0, newArray, 0, i);
              }
              while (input.getBytesUntilLimit() > 0) {
                int value = input.readInt32();
                switch (value) {
                  case com.android.usbtuner.data.Channel.MPEG1AUDIO:
                  case com.android.usbtuner.data.Channel.MPEG2AUDIO:
                  case com.android.usbtuner.data.Channel.MPEG2AACAUDIO:
                  case com.android.usbtuner.data.Channel.MPEG4LATMAACAUDIO:
                  case com.android.usbtuner.data.Channel.A52AC3AUDIO:
                  case com.android.usbtuner.data.Channel.EAC3AUDIO:
                    newArray[i++] = value;
                    break;
                }
              }
              this.audioStreamTypes = newArray;
            }
            input.popLimit(limit);
            break;
          }
          case 152: {
            this.audioTrackIndex = input.readInt32();
            break;
          }
          case 162: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 162);
            int i = this.captionTracks == null ? 0 : this.captionTracks.length;
            com.android.usbtuner.data.Track.AtscCaptionTrack[] newArray =
                new com.android.usbtuner.data.Track.AtscCaptionTrack[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.captionTracks, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.android.usbtuner.data.Track.AtscCaptionTrack();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.android.usbtuner.data.Track.AtscCaptionTrack();
            input.readMessage(newArray[i]);
            this.captionTracks = newArray;
            break;
          }
          case 168: {
            this.hasCaptionTrack = input.readBool();
            break;
          }
          case 176: {
            int value = input.readInt32();
            switch (value) {
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_RESERVED:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ANALOG_TELEVISION_CHANNELS:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_DIGITAL_TELEVISION:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_AUDIO:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_DATA_ONLY_SERVICE:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_SOFTWARE_DOWNLOAD:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_UNASSOCIATED_SMALL_SCREEN_SERVICE:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_PARAMETERIZED_SERVICE:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_ATSC_NRT_SERVICE:
              case com.android.usbtuner.data.Channel.SERVICE_TYPE_EXTENDED_PARAMERTERIZED_SERVICE:
                this.serviceType = value;
                break;
            }
            break;
          }
        }
      }
    }

    public static TunerChannelProto parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new TunerChannelProto(), data);
    }

    public static TunerChannelProto parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new TunerChannelProto().mergeFrom(input);
    }
  }
}
