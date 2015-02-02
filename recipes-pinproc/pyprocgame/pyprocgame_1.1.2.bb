SUMMARY = "A Python-based pinball software development framework for use with P-ROC."
HOMEPAGE = "http://pyprocgame.pindev.org"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "pypinproc python-imaging"
PR = "r1"

SRC_URI = "git://github.com/preble/pyprocgame.git;branch=master;protocol=http"
SRCREV = "af19394d76cf0834a17efb8f324d1d4a0b0deabf" 

SRCNAME = "pyprocgame"
S = "${WORKDIR}/git"

inherit setuptools 

# install what is needed for numpy.test()
RDEPENDS_${PN} = "python-misc \
                  python-mmap \
                  python-netclient \
                  python-numbers \
                  python-subprocess \
                  python-compression \
                  python-datetime \
                  python-sqlite3 \
                  python-imaging \
                  pypinproc"
