require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "\
    kevoree-js \
    "

export IMAGE_BASENAME = "kevoree"

PR = "r0"

IMAGE_LINGUAS = " "
USE_NLS="no"

LICENSE = "CLOSED"
