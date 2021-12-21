# Jaagl
Java API agnostic GL - wrapper around LWJGL / JOGL so that projects can easily switch between the two

## No longer maintained

This project is no longer maintained separately. It was integrated directly into https://github.com/OpenGrabeso/glg2d,
which was the only project using it.

#### Design rationale

The API strives to provide an interface common for both LWJGL / JOGL. The interface is kept intentionaly simple
even if sometimes it means some optimization specific for one of the APIs will not be available.

While the general structure mostly follows JOGL design, some API are more like what users of LWJGL are used to see
(esp. when arrays are passed as parameters).
