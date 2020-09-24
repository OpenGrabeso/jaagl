package com.github.opengrabeso.jaagl;

import java.nio.ByteBuffer;

public interface GL {
    GL2 getGL2();
    GL3 getGL3();
    GL2GL3 getGL2GL3();

    GL3 gl3();
    GL2 gl2();

    boolean isExtensionAvailable(String name);


    int GL_TEXTURE0();

    int GL_SCISSOR_TEST();

    int GL_SRC_ALPHA();

    int GL_ONE_MINUS_SRC_ALPHA();

    int GL_TEXTURE_2D();

    int GL_TEXTURE();

    void glDisable(int gl_lighting);

    void glEnable(int gl_blend);

    int GL_BLEND();

    int GL_DEPTH_TEST();

    int GL_CULL_FACE();

    void glActiveTexture(int unit);

    void glBindTexture(int type, int handle);

    void glDeleteTextures(int i, int[] handles, int i1);

    void glGenTextures(int i, int[] handles, int i1);

    int GL_LINEAR();

    int GL_LINEAR_MIPMAP_NEAREST();

    int GL_NEAREST();

    int GL_NEAREST_MIPMAP_NEAREST();

    int GL_TEXTURE_MAG_FILTER();

    int GL_TEXTURE_MIN_FILTER();

    void glTexParameteri(int type, int name, int value);

    int GL_MAX_TEXTURE_SIZE();

    void glGetIntegerv(int gl_max_texture_size, int[] size, int i);

    int GL_UNPACK_ALIGNMENT();

    int GL_UNPACK_SKIP_ROWS();

    int GL_UNPACK_SKIP_PIXELS();

    int GL_UNPACK_ROW_LENGTH();

    void glPixelStorei(int gl_unpack_alignment, int i);

    int GL_UNSIGNED_BYTE();

    int GL_TEXTURE_1D();

    int GL_TEXTURE_3D();

    int GL_TEXTURE31();

    int GL_COLOR_BUFFER_BIT();

    int GL_DEPTH_BUFFER_BIT();


    GLProfile getGLProfile();

    void glTexImage2D(int gl_texture_2D, int i, int i1, int size, int size1, int i2, int i3, int gl_unsigned_byte, ByteBuffer buffer);

    void glTexSubImage2D(int gl_texture_2D, int i, int x, int y, int width, int height, int format, int gl_unsigned_byte, ByteBuffer wrap);

    void glGenerateMipmap(int gl_texture_2D);

    boolean glIsEnabled(int gl_depth_test);

    int GL_ONE();

    void glBlendFunc(int gl_one, int gl_one_minus_src_alpha);

    RuntimeException newGLException(String log);

    int GL_FLOAT();

    int GL_RGB();

    void glFlush();

    int GL_TRIANGLES();

    void glClearColor(float i, float i1, float i2, float i3);

    void glClear(int gl_color_buffer_bit);

    void glViewport(int i, int i1, int i2, int i3);

    int glGetError();

    int GL_NO_ERROR();

    boolean isGL2GL3();
}
