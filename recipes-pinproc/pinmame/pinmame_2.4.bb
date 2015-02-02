DESCRIPTION = "C API for the P-ROC pinball controller board."
SECTION = "libraries"
DEPENDS = "libpinproc ncurses libsdl zlib yaml-cpp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "git://github.com/tomlogic/pinmame.git;branch=proc_unix;protocol=http \
           file://makefile.patch "
SRCREV = "07b272aeea6292a0b065ae6ae7f6c35c5c9ef1c3"

S = "${WORKDIR}/git"

inherit native 

EXTRA_OECMAKE = "-f Makefile.unix"
