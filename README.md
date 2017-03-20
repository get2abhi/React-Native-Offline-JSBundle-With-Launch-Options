# React-Native-Offline-JSBundle-With-Launch-Options
Invoking standalone react native application as jsbunle with some launch options/initial properties/command line arguments. This can help writing a loosely coupled react native application


Step 1: Export jsbundle

  curl "http://localhost:8081/index.android.bundle?platform=android" -o lo.jsbundle
  
Step 2: Push jsbundle to device

  adb push lo.jsbundle /storage/sdcard/Download
