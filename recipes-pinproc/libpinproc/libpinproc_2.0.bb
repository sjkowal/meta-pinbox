DESCRIPTION = "C API for the P-ROC pinball controller board."
SECTION = "libraries"
DEPENDS = "libusb1 libftdi ncurses libsdl zlib yaml-cpp"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "git://github.com/preble/libpinproc.git;branch=dev;protocol=http \
           file://robust_cmake.patch "
SRCREV = "5aba1a5c8b6ba36f093f0837e2851a546fa4233d"

S = "${WORKDIR}/git"

inherit cmake pkgconfig 

EXTRA_OECMAKE = "-DBUILD_SHARED_LIBS=ON -DPINPROC_BUILD_TOOLS=ON"

RDEPENDS_${PN} = "libusb1 libftdi zlib yaml-cpp"
