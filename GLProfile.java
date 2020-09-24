package com.github.opengrabeso.jaagl;

public class GLProfile {
    com.jogamp.opengl.GLProfile glProfile;

    GLProfile(com.jogamp.opengl.GLProfile glProfile) {
        this.glProfile = glProfile;
    }

    public boolean isGL3() {
        return glProfile.isGL3();
    }

    public boolean isGL2() {
        return glProfile.isGL2();
    }

    static public GLProfile wrap(com.jogamp.opengl.GLProfile glProfile) {
        return new GLProfile(glProfile);
    }
}
