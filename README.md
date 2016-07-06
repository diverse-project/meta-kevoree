yocto layer for Kevoree
=======================

# Requirements

Depends on layer `meta-nodejs`: https://github.com/imyller/meta-nodejs

# Recipes

* `kevoree-js':
  * Install kevoree-nodejs-runtime from npm

# Images

* `kevoree-image`:
  * Base: core-image-minimal
  * Packages: kevoree-js
