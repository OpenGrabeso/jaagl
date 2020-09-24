package com.github.opengrabeso.jaagl.jogl;
import com.github.opengrabeso.jaagl.*;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class JoGL2GL3 extends JoGL implements GL2GL3 {
    private com.jogamp.opengl.GL2GL3 ggl() {
        return (com.jogamp.opengl.GL2GL3)this.gl;
    }

    public JoGL2GL3(com.jogamp.opengl.GL gl) {
        super(gl);
    }

    @Override
    public GL2GL3 getGL2GL3() {
        return this;
    }

    @Override
    public boolean isGL2GL3() {
        return true;
    }

    @Override
    public int GL_VERTEX_SHADER() {
        return com.jogamp.opengl.GL2GL3.GL_VERTEX_SHADER;
    }

    @Override
    public int GL_FRAGMENT_SHADER() {
        return com.jogamp.opengl.GL2GL3.GL_FRAGMENT_SHADER;
    }

    public void glUseProgram(int program) {
        ggl().glUseProgram(program);
    }

    public void glDeleteProgram(int program) {
        ggl().glDeleteProgram(program);
    }

    public void glUniformMatrix4fv(int location, int i, boolean transpose, float[] value, int i1) {
        ggl().glUniformMatrix4fv(location, i, transpose, value, i1);
    }

    public int glCreateProgram() {
        return ggl().glCreateProgram();
    }

    public void glAttachShader(int program, int vs) {
        ggl().glAttachShader(program, vs);
    }

    public void glLinkProgram(int program) {
        ggl().glLinkProgram(program);
    }

    public void glValidateProgram(int program) {
        ggl().glValidateProgram(program);
    }

    public void glDeleteShader(int vs) {
        ggl().glDeleteShader(vs);
    }

    public void glGenBuffers(int i, int[] handles, int i1) {
        ggl().glGenBuffers(i, handles, i1);
    }

    public int GL_ARRAY_BUFFER() {
        return com.jogamp.opengl.GL2GL3.GL_ARRAY_BUFFER;
    }

    public int GL_STREAM_DRAW() {
        return com.jogamp.opengl.GL2GL3.GL_STREAM_DRAW;
    }

    public void glBindBuffer(int gl_array_buffer, int vbo) {
        ggl().glBindBuffer(gl_array_buffer, vbo);
    }

    public void glBufferData(int gl_array_buffer, int size, Buffer o, int gl_stream_draw) {
        ggl().glBufferData(gl_array_buffer, size, o, gl_stream_draw);
    }

    public int GL_VALIDATE_STATUS() {
        return com.jogamp.opengl.GL2GL3.GL_VALIDATE_STATUS;
    }

    public int GL_LINK_STATUS() {
        return com.jogamp.opengl.GL2GL3.GL_LINK_STATUS;
    }

    public int GL_COMPILE_STATUS() {
        return com.jogamp.opengl.GL2GL3.GL_COMPILE_STATUS;
    }

    public int glCreateShader(int type) {
        return ggl().glCreateShader(type);
    }

    public void glShaderSource(int shader, int i, String[] strings, IntBuffer o) {
        ggl().glShaderSource(shader, i, strings, o);
    }

    public void glCompileShader(int shader) {
        ggl().glCompileShader(shader);
    }

    public int GL_VERTEX_ARRAY() {
        return com.jogamp.opengl.GLES2.GL_VERTEX_ARRAY;
    }

    public int GL_TEXTURE_COORD_ARRAY() {
        return com.jogamp.opengl.GL2ES1.GL_TEXTURE_COORD_ARRAY;
    }

    public void glDeleteBuffers(int i, int[] handles, int i1) {
        ggl().glDeleteBuffers(i, handles, i1);
    }

    public void glBufferSubData(int gl_array_buffer, int i, int sizeInBytes, FloatBuffer data) {
        ggl().glBufferSubData(gl_array_buffer, i, sizeInBytes, data);
    }

    public void glDrawArrays(int gl_quads, int i, int sizeInVertices) {
        ggl().glDrawArrays(gl_quads, i, sizeInVertices);
    }

    public void glEnableVertexAttribArray(int coordLoc) {
        ggl().glEnableVertexAttribArray(coordLoc);
    }

    public int glGetAttribLocation(int program, String coordAttribName) {
        return ggl().glGetAttribLocation(program, coordAttribName);
    }

    public void glBindVertexArray(int i) {
        ggl().glBindVertexArray(i);
    }

    public void glVertexAttribPointer(int coordLoc, int floatsPerCoord, int gl_float, boolean b, int stride, int coordOffset) {
        ggl().glVertexAttribPointer(coordLoc, floatsPerCoord, gl_float, b, stride, coordOffset);
    }

    public void glGenVertexArrays(int i, int[] handles, int i1) {
        ggl().glGenVertexArrays(i, handles, i1);
    }

    public void glDeleteVertexArrays(int i, int[] handles, int i1) {
        ggl().glDeleteVertexArrays(i, handles, i1);
    }

    @Override
    public int glGetUniformLocation(int program, String name) {
        return ggl().glGetUniformLocation(program, name);
    }

    @Override
    public void glUniform4fv(int location, int i, float[] value, int i1) {
        ggl().glUniform4fv(location, i, value, i1);
    }

    @Override
    public int GL_INFO_LOG_LENGTH() {
        return com.jogamp.opengl.GL2ES2.GL_INFO_LOG_LENGTH;
    }

    @Override
    public void glGetShaderiv(int shaderObj, int gl_info_log_length, int[] infoLogLength, int i) {
        ggl().glGetShaderiv(shaderObj, gl_info_log_length, infoLogLength, i);
    }

    @Override
    public void glGetShaderInfoLog(int shaderObj, int i, int[] charsWritten, int i1, byte[] infoLogBytes, int i2) {
        ggl().glGetShaderInfoLog(shaderObj, i, charsWritten, i1, infoLogBytes, i2);
    }

    @Override
    public void glGetProgramiv(int programObj, int gl_info_log_length, int[] infoLogLength, int i) {
        ggl().glGetProgramiv(programObj, gl_info_log_length, infoLogLength, i);
    }

    @Override
    public void glGetProgramInfoLog(int programObj, int i, int[] charsWritten, int i1, byte[] infoLogBytes, int i2) {
        ggl().glGetProgramInfoLog(programObj, i, charsWritten, i1, infoLogBytes, i2);
    }

    @Override
    public boolean glIsProgram(int programObj) {
        return ggl().glIsProgram(programObj);
    }

    @Override
    public void glDetachShader(int program, int i) {
        ggl().glDetachShader(program, i);
    }
}
