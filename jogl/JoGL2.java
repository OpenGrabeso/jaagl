package com.github.opengrabeso.jaagl.jogl;
import com.github.opengrabeso.jaagl.*;

public class JoGL2 extends JoGL2GL3 implements GL2 {
    private com.jogamp.opengl.GL2 ggl() {
        return (com.jogamp.opengl.GL2)this.gl;
    }

    public JoGL2(com.jogamp.opengl.GL gl) {
        super(gl);
    }

    @Override
    public GL2 getGL2() {
        return this;
    }

    @Override
    public int GL_TEXTURE_ENV() {
        return com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV;
    }

    @Override
    public int GL_TEXTURE_ENV_MODE() {
        return com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV_MODE;
    }

    @Override
    public int GL_MODULATE() {
        return com.jogamp.opengl.GL2ES1.GL_MODULATE;
    }

    public long GL_ALL_CLIENT_ATTRIB_BITS() {
        return com.jogamp.opengl.GL2.GL_ALL_CLIENT_ATTRIB_BITS;
    }

    @Override
    public int GL_SCISSOR_BIT() {
        return com.jogamp.opengl.GL2.GL_SCISSOR_BIT;
    }

    public void glPushClientAttrib(int gl_all_client_attrib_bits) {
        ggl().glPushClientAttrib(gl_all_client_attrib_bits);
    }

    public void glEnableClientState(int gl_vertex_array) {
        ggl().glEnableClientState(gl_vertex_array);
    }

    public void glVertexPointer(int floatsPerPoint, int gl_float, int stride, int pointOffset) {
        ggl().glVertexPointer(floatsPerPoint, gl_float, stride, pointOffset);
    }

    public void glTexCoordPointer(int floatsPerCoord, int gl_float, int stride, int coordOffset) {
        ggl().glTexCoordPointer(floatsPerCoord, gl_float, stride, coordOffset);
    }

    public int GL_QUADS() {
        return com.jogamp.opengl.GL2.GL_QUADS;
    }

    public void glPopClientAttrib() {
        ggl().glPopClientAttrib();
    }

    public int GL_LIGHTING() {
        return com.jogamp.opengl.GL2.GL_LIGHTING;
    }

    public void glPushAttrib(int attribMask) {
        ggl().glPushAttrib(attribMask);
    }

    public int GL_PROJECTION() {
        return com.jogamp.opengl.GL2.GL_PROJECTION;
    }

    public int GL_MODELVIEW() {
        return com.jogamp.opengl.GL2.GL_MODELVIEW;
    }

    public void glTexEnvi(int gl_texture_env, int gl_texture_env_mode, int gl_modulate) {
        ggl().glTexEnvi(gl_texture_env, gl_texture_env_mode, gl_modulate);
    }

    @Override
    public void glMatrixMode(int gl_projection) {
        ggl().glMatrixMode(gl_projection);
    }

    public void glPushMatrix() {
        ggl().glPushMatrix();
    }

    public void glLoadIdentity() {
        ggl().glLoadIdentity();
    }

    public void glOrtho(int i, int width, int i1, int height, int i2, int i3) {
        ggl().glOrtho(i, width, i1, height, i2, i3);
    }

    public void glPopMatrix() {
        ggl().glPopMatrix();
    }

    public void glPopAttrib() {
        ggl().glPopAttrib();
    }

    @Override
    public void glColor4f(float r, float g, float b, float a) {
        ggl().glColor4f(r, g, b, a);
    }

    public int GL_ENABLE_BIT() {
        return com.jogamp.opengl.GL2.GL_ENABLE_BIT;
    }

    public int GL_TEXTURE_BIT() {
        return com.jogamp.opengl.GL2.GL_TEXTURE_BIT;
    }

    public int GL_TRANSFORM_BIT() {
        return com.jogamp.opengl.GL2.GL_TRANSFORM_BIT;
    }

    @Override
    public int GL_UNPACK_SKIP_ROWS() {
        return  com.jogamp.opengl.GL2.GL_UNPACK_SKIP_ROWS;
    }

    @Override
    public int GL_UNPACK_SKIP_PIXELS() {
        return  com.jogamp.opengl.GL2.GL_UNPACK_SKIP_PIXELS;
    }

    @Override
    public int GL_UNPACK_ROW_LENGTH() {
        return  com.jogamp.opengl.GL2.GL_UNPACK_ROW_LENGTH;
    }

    public int GL_INTENSITY() {
        return com.jogamp.opengl.GL2.GL_INTENSITY;
    }

    public int GL_LUMINANCE() {
        return com.jogamp.opengl.GL2.GL_LUMINANCE;
    }
}
