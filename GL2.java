package com.github.opengrabeso.jaagl;

public interface GL2 extends GL, GL2GL3 {
    int GL_LIGHTING();

    void glPushAttrib(int attribMask);

    int GL_PROJECTION();

    int GL_MODELVIEW();

    void glBlendFunc(int gl_src_alpha, int gl_one_minus_src_alpha);

    void glTexEnvi(int gl_texture_env, int gl_texture_env_mode, int gl_modulate);

    void glMatrixMode(int gl_projection);

    void glPushMatrix();

    void glLoadIdentity();

    void glOrtho(int i, int width, int i1, int height, int i2, int i3);

    void glPopMatrix();

    void glPopAttrib();

    void glColor4f(float r, float g, float b, float a);

    int GL_ENABLE_BIT();

    int GL_TEXTURE_BIT();

    int GL_TRANSFORM_BIT();

    int GL_UNPACK_SKIP_ROWS();

    int GL_UNPACK_SKIP_PIXELS();

    int GL_UNPACK_ROW_LENGTH();

    int GL_INTENSITY();

    int GL_LUMINANCE();

    int GL_TEXTURE_ENV();

    int GL_TEXTURE_ENV_MODE();

    int GL_MODULATE();

    long GL_ALL_CLIENT_ATTRIB_BITS();

    int GL_SCISSOR_BIT();

    void glPushClientAttrib(int gl_all_client_attrib_bits);

    void glEnableClientState(int gl_vertex_array);

    void glVertexPointer(int floatsPerPoint, int gl_float, int stride, int pointOffset);

    void glTexCoordPointer(int floatsPerCoord, int gl_float, int stride, int coordOffset);

    int GL_QUADS();

    void glPopClientAttrib();
}
