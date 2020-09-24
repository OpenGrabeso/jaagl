package com.github.opengrabeso.jaagl.jogl;
import com.github.opengrabeso.jaagl.*;

import java.nio.ByteBuffer;

public class JoGL implements GL {
    com.jogamp.opengl.GL gl;

    JoGL(com.jogamp.opengl.GL gl) {
        this.gl = gl;
    }

    static GL wrap(com.jogamp.opengl.GL gl) {
        return new JoGL(gl);
    }

    @Override
    public GL2 getGL2() {
        return null;
    }

    @Override
    public GL3 getGL3() {
        return null;
    }

    @Override
    public GL3 gl3() {
        return getGL3();
    }

    @Override
    public GL2 gl2() {
        return getGL2();
    }

    @Override
    public void glViewport(int i, int i1, int i2, int i3) {
        gl.glViewport(i, i1, i2, i3);
    }

    @Override
    public boolean isExtensionAvailable(String name) {
        return gl.isExtensionAvailable(name);
    }

    @Override
    public int GL_TEXTURE0() {
        return com.jogamp.opengl.GL.GL_TEXTURE0;
    }

    @Override
    public int GL_SCISSOR_TEST() {
        return com.jogamp.opengl.GL.GL_SCISSOR_TEST;
    }

    @Override
    public int GL_SRC_ALPHA() {
        return com.jogamp.opengl.GL.GL_SRC_ALPHA;
    }

    @Override
    public int GL_ONE_MINUS_SRC_ALPHA() {
        return com.jogamp.opengl.GL.GL_ONE_MINUS_SRC_ALPHA;
    }

    @Override
    public int GL_TEXTURE_2D() {
        return com.jogamp.opengl.GL.GL_TEXTURE_2D;
    }

    @Override
    public int GL_TEXTURE() {
        return com.jogamp.opengl.GL.GL_TEXTURE;
    }

    @Override
    public void glDisable(int par) {
        gl.glDisable(par);
    }

    @Override
    public void glEnable(int par) {
        gl.glEnable(par);
    }

    @Override
    public int GL_BLEND() {
        return com.jogamp.opengl.GL.GL_BLEND;
    }

    @Override
    public int GL_DEPTH_TEST() {
        return com.jogamp.opengl.GL.GL_DEPTH_TEST;
    }

    @Override
    public int GL_CULL_FACE() {
        return com.jogamp.opengl.GL.GL_CULL_FACE;
    }

    @Override
    public void glActiveTexture(int unit) {
        gl.glActiveTexture(unit);
    }

    @Override
    public void glBindTexture(int type, int handle) {
        gl.glBindTexture(type, handle);
    }

    @Override
    public void glDeleteTextures(int i, int[] handles, int i1) {
        gl.glDeleteTextures(i, handles, i1);
    }

    @Override
    public void glGenTextures(int i, int[] handles, int i1) {
        gl.glGenTextures(i, handles, i1);
    }

    @Override
    public int GL_LINEAR() {
        return com.jogamp.opengl.GL.GL_LINEAR;
    }

    @Override
    public int GL_LINEAR_MIPMAP_NEAREST() {
        return com.jogamp.opengl.GL.GL_LINEAR_MIPMAP_NEAREST;
    }

    @Override
    public int GL_NEAREST() {
        return com.jogamp.opengl.GL.GL_NEAREST;
    }

    @Override
    public int GL_NEAREST_MIPMAP_NEAREST() {
        return com.jogamp.opengl.GL.GL_NEAREST_MIPMAP_NEAREST;
    }

    @Override
    public int GL_TEXTURE_MAG_FILTER() {
        return com.jogamp.opengl.GL.GL_TEXTURE_MAG_FILTER;
    }

    @Override
    public int GL_TEXTURE_MIN_FILTER() {
        return com.jogamp.opengl.GL.GL_TEXTURE_MIN_FILTER;
    }

    @Override
    public void glTexParameteri(int type, int name, int value) {

    }

    @Override
    public int GL_MAX_TEXTURE_SIZE() {
        return com.jogamp.opengl.GL.GL_MAX_TEXTURE_SIZE;
    }

    @Override
    public void glGetIntegerv(int gl_max_texture_size, int[] size, int i) {

    }

    @Override
    public int GL_UNPACK_ALIGNMENT() {
        return com.jogamp.opengl.GL.GL_UNPACK_ALIGNMENT;
    }

    @Override
    public void glPixelStorei(int gl_unpack_alignment, int i) {

    }

    @Override
    public int GL_UNSIGNED_BYTE() {
        return com.jogamp.opengl.GL.GL_UNSIGNED_BYTE;
    }

    @Override
    public int GL_TEXTURE_1D() {
        return com.jogamp.opengl.GL2GL3.GL_TEXTURE_1D;
    }

    @Override
    public int GL_TEXTURE_3D() {
        return com.jogamp.opengl.GL2GL3.GL_TEXTURE_3D;
    }

    @Override
    public int GL_TEXTURE31() {
        return com.jogamp.opengl.GL.GL_TEXTURE31;
    }

    @Override
    public int GL_COLOR_BUFFER_BIT() {
        return com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
    }

    @Override
    public int GL_DEPTH_BUFFER_BIT() {
        return com.jogamp.opengl.GL.GL_DEPTH_BUFFER_BIT;
    }

    @Override
    public GLProfile getGLProfile() {
        return null;
    }

    @Override
    public void glTexImage2D(int gl_texture_2D, int i, int i1, int size, int size1, int i2, int i3, int gl_unsigned_byte, ByteBuffer buffer) {

    }

    @Override
    public void glTexSubImage2D(int gl_texture_2D, int i, int x, int y, int width, int height, int format, int gl_unsigned_byte, ByteBuffer wrap) {

    }

    @Override
    public void glGenerateMipmap(int gl_texture_2D) {

    }

    @Override
    public boolean glIsEnabled(int gl_depth_test) {
        return false;
    }

    @Override
    public int GL_ONE() {
        return 0;
    }

    @Override
    public void glBlendFunc(int gl_one, int gl_one_minus_src_alpha) {

    }

    @Override
    public RuntimeException newGLException(String log) {
        return null;
    }

    @Override
    public int GL_FLOAT() {
        return 0;
    }

    @Override
    public int GL_RGB() {
        return 0;
    }

    @Override
    public void glFlush() {

    }

    @Override
    public int GL_TRIANGLES() {
        return 0;
    }

    @Override
    public void glClearColor(float i, float i1, float i2, float i3) {

    }

    @Override
    public void glClear(int gl_color_buffer_bit) {

    }
}
