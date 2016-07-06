DESCRIPTION = "Kevoree JS Runtime"
HOMEPAGE = "http://kevoree.org/"
SECTION = "js"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94a3f3bdf61243b5e5cf569fbfbbea52"

PACKAGES = "${PN}"

PV = "5.7.0-0"
PR = "r1"

S = "${WORKDIR}/git/"
SRCREV = "v${PV}"
SRC_URI = "git://github.com/kevoree/kevoree-nodejs-runtime.git"

inherit npm-install-global
