/* //device/java/android/javax/microedition/khronos/opengles/GL11ExtensionPack.java
**
** Copyright 2007, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/

// This source file is automatically generated

package javax.microedition.khronos.opengles;
public interface GL11ExtensionPack
  extends javax.microedition.khronos.opengles.GL
{
public abstract  void glBindFramebufferOES(int target, int framebuffer);
public abstract  void glBindRenderbufferOES(int target, int renderbuffer);
public abstract  void glBindTexture(int target, int texture);
public abstract  void glBlendEquation(int mode);
public abstract  void glBlendEquationSeparate(int modeRGB, int modeAlpha);
public abstract  void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);
public abstract  int glCheckFramebufferStatusOES(int target);
public abstract  void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, java.nio.Buffer data);
public abstract  void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border);
public abstract  void glDeleteFramebuffersOES(int n, int[] framebuffers, int offset);
public abstract  void glDeleteFramebuffersOES(int n, java.nio.IntBuffer framebuffers);
public abstract  void glDeleteRenderbuffersOES(int n, int[] renderbuffers, int offset);
public abstract  void glDeleteRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers);
public abstract  void glEnable(int cap);
public abstract  void glFramebufferRenderbufferOES(int target, int attachment, int renderbuffertarget, int renderbuffer);
public abstract  void glFramebufferTexture2DOES(int target, int attachment, int textarget, int texture, int level);
public abstract  void glGenerateMipmapOES(int target);
public abstract  void glGenFramebuffersOES(int n, int[] framebuffers, int offset);
public abstract  void glGenFramebuffersOES(int n, java.nio.IntBuffer framebuffers);
public abstract  void glGenRenderbuffersOES(int n, int[] renderbuffers, int offset);
public abstract  void glGenRenderbuffersOES(int n, java.nio.IntBuffer renderbuffers);
public abstract  void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, int[] params, int offset);
public abstract  void glGetFramebufferAttachmentParameterivOES(int target, int attachment, int pname, java.nio.IntBuffer params);
public abstract  void glGetIntegerv(int pname, int[] params, int offset);
public abstract  void glGetIntegerv(int pname, java.nio.IntBuffer params);
public abstract  void glGetRenderbufferParameterivOES(int target, int pname, int[] params, int offset);
public abstract  void glGetRenderbufferParameterivOES(int target, int pname, java.nio.IntBuffer params);
public abstract  void glGetTexGenfv(int coord, int pname, float[] params, int offset);
public abstract  void glGetTexGenfv(int coord, int pname, java.nio.FloatBuffer params);
public abstract  void glGetTexGeniv(int coord, int pname, int[] params, int offset);
public abstract  void glGetTexGeniv(int coord, int pname, java.nio.IntBuffer params);
public abstract  void glGetTexGenxv(int coord, int pname, int[] params, int offset);
public abstract  void glGetTexGenxv(int coord, int pname, java.nio.IntBuffer params);
public abstract  boolean glIsFramebufferOES(int framebuffer);
public abstract  boolean glIsRenderbufferOES(int renderbuffer);
public abstract  void glRenderbufferStorageOES(int target, int internalformat, int width, int height);
public abstract  void glStencilOp(int fail, int zfail, int zpass);
public abstract  void glTexEnvf(int target, int pname, float param);
public abstract  void glTexEnvfv(int target, int pname, float[] params, int offset);
public abstract  void glTexEnvfv(int target, int pname, java.nio.FloatBuffer params);
public abstract  void glTexEnvx(int target, int pname, int param);
public abstract  void glTexEnvxv(int target, int pname, int[] params, int offset);
public abstract  void glTexEnvxv(int target, int pname, java.nio.IntBuffer params);
public abstract  void glTexGenf(int coord, int pname, float param);
public abstract  void glTexGenfv(int coord, int pname, float[] params, int offset);
public abstract  void glTexGenfv(int coord, int pname, java.nio.FloatBuffer params);
public abstract  void glTexGeni(int coord, int pname, int param);
public abstract  void glTexGeniv(int coord, int pname, int[] params, int offset);
public abstract  void glTexGeniv(int coord, int pname, java.nio.IntBuffer params);
public abstract  void glTexGenx(int coord, int pname, int param);
public abstract  void glTexGenxv(int coord, int pname, int[] params, int offset);
public abstract  void glTexGenxv(int coord, int pname, java.nio.IntBuffer params);
public abstract  void glTexParameterf(int target, int pname, float param);
public static final int GL_BLEND_DST_ALPHA = 32970;
public static final int GL_BLEND_DST_RGB = 32968;
public static final int GL_BLEND_EQUATION = 32777;
public static final int GL_BLEND_EQUATION_ALPHA = 34877;
public static final int GL_BLEND_EQUATION_RGB = 32777;
public static final int GL_BLEND_SRC_ALPHA = 32971;
public static final int GL_BLEND_SRC_RGB = 32969;
public static final int GL_COLOR_ATTACHMENT0_OES = 36064;
public static final int GL_COLOR_ATTACHMENT10_OES = 36074;
public static final int GL_COLOR_ATTACHMENT11_OES = 36075;
public static final int GL_COLOR_ATTACHMENT12_OES = 36076;
public static final int GL_COLOR_ATTACHMENT13_OES = 36077;
public static final int GL_COLOR_ATTACHMENT14_OES = 36078;
public static final int GL_COLOR_ATTACHMENT15_OES = 36079;
public static final int GL_COLOR_ATTACHMENT1_OES = 36065;
public static final int GL_COLOR_ATTACHMENT2_OES = 36066;
public static final int GL_COLOR_ATTACHMENT3_OES = 36067;
public static final int GL_COLOR_ATTACHMENT4_OES = 36068;
public static final int GL_COLOR_ATTACHMENT5_OES = 36069;
public static final int GL_COLOR_ATTACHMENT6_OES = 36070;
public static final int GL_COLOR_ATTACHMENT7_OES = 36071;
public static final int GL_COLOR_ATTACHMENT8_OES = 36072;
public static final int GL_COLOR_ATTACHMENT9_OES = 36073;
public static final int GL_DECR_WRAP = 34056;
public static final int GL_DEPTH_ATTACHMENT_OES = 36096;
public static final int GL_DEPTH_COMPONENT = 6402;
public static final int GL_DEPTH_COMPONENT16 = 33189;
public static final int GL_DEPTH_COMPONENT24 = 33190;
public static final int GL_DEPTH_COMPONENT32 = 33191;
public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES = 36049;
public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES = 36048;
public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES = 36051;
public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES = 36050;
public static final int GL_FRAMEBUFFER_BINDING_OES = 36006;
public static final int GL_FRAMEBUFFER_COMPLETE_OES = 36053;
public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES = 36054;
public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES = 36057;
public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_OES = 36059;
public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES = 36058;
public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES = 36055;
public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_OES = 36060;
public static final int GL_FRAMEBUFFER_OES = 36160;
public static final int GL_FRAMEBUFFER_UNSUPPORTED_OES = 36061;
public static final int GL_FUNC_ADD = 32774;
public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
public static final int GL_FUNC_SUBTRACT = 32778;
public static final int GL_INCR_WRAP = 34055;
public static final int GL_INVALID_FRAMEBUFFER_OPERATION_OES = 1286;
public static final int GL_MAX_COLOR_ATTACHMENTS_OES = 36063;
public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
public static final int GL_MAX_RENDERBUFFER_SIZE_OES = 34024;
public static final int GL_MIRRORED_REPEAT = 33648;
public static final int GL_NORMAL_MAP = 34065;
public static final int GL_REFLECTION_MAP = 34066;
public static final int GL_RENDERBUFFER_ALPHA_SIZE_OES = 36179;
public static final int GL_RENDERBUFFER_BINDING_OES = 36007;
public static final int GL_RENDERBUFFER_BLUE_SIZE_OES = 36178;
public static final int GL_RENDERBUFFER_DEPTH_SIZE_OES = 36180;
public static final int GL_RENDERBUFFER_GREEN_SIZE_OES = 36177;
public static final int GL_RENDERBUFFER_HEIGHT_OES = 36163;
public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_OES = 36164;
public static final int GL_RENDERBUFFER_OES = 36161;
public static final int GL_RENDERBUFFER_RED_SIZE_OES = 36176;
public static final int GL_RENDERBUFFER_STENCIL_SIZE_OES = 36181;
public static final int GL_RENDERBUFFER_WIDTH_OES = 36162;
public static final int GL_RGB565_OES = 36194;
public static final int GL_RGB5_A1 = 32855;
public static final int GL_RGB8 = 32849;
public static final int GL_RGBA4 = 32854;
public static final int GL_RGBA8 = 32856;
public static final int GL_STENCIL_ATTACHMENT_OES = 36128;
public static final int GL_STENCIL_INDEX = 6401;
public static final int GL_STENCIL_INDEX1_OES = 36166;
public static final int GL_STENCIL_INDEX4_OES = 36167;
public static final int GL_STENCIL_INDEX8_OES = 36168;
public static final int GL_STR = -1;
public static final int GL_TEXTURE_BINDING_CUBE_MAP = 34068;
public static final int GL_TEXTURE_CUBE_MAP = 34067;
public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
public static final int GL_TEXTURE_GEN_MODE = 9472;
public static final int GL_TEXTURE_GEN_STR = 36192;
}
