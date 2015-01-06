SUMMARY = "Python module wrapping libpinproc, API for the P-ROC pinball controller board."
HOMEPAGE = "https://github.com/preble/pypinproc"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "libpinproc python-pyyaml"
PR = "r0"

SRC_URI = "git://github.com/preble/pypinproc.git;branch=master;protocol=http \
           file://setup.py.patch "
SRCREV = "d0926c62293fec1283086b73f8c044d747b478ef" 

SRCNAME = "pypinproc"
S = "${WORKDIR}/git"

inherit distutils
