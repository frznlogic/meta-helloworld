do_install:append () {
    echo "deleting motd"
    rm ${D}${sysconfdir}/motd
}
