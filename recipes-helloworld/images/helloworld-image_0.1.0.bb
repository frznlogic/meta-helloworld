DESCRIPTION = "An image containing hello world"

inherit core-image

IMAGE_FEATURES = " ssh-server-openssh"

IMAGE_INSTALL += " helloworld"
