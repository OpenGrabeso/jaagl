package com.github.opengrabeso.jaagl;

public abstract class GLContext {
    private static GL currentGL;

    public static GL getCurrentGL() {
        return GLContext.currentGL;
    }

    public static void setCurrentGL(GL currentGL) {
        GLContext.currentGL = currentGL;
    }
}
