DESCRIPTION = "Target packages for Qt Embedded SDK"

PR = "r7"

QTLIBPREFIX = "-embedded"

require recipes-qt/packagegroups/packagegroup-qt-toolchain-target.inc

RDEPENDS_${PN} += " \
	libmcc \
	libmcc-dev \
	libmcc-staticdev \
	kernel-module-mcc \
	kernel-module-mcc-dev \
	kernel-headers \
"
