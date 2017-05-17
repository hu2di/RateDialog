# RateDialog
The android library show dialog rate app

## Screenshot
<img src="https://raw.githubusercontent.com/hu2di/CheckAppID/master/Screenshot/screenshot.png">

## SDK Support
Support from SDK version 14 onwards

## Download
JitPack:<br>
Step 1. Add the JitPack repository to your build file<br>
Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency
```groovy
dependencies {
    compile 'com.github.hu2di:RateDialog:1.0.1'
}
```

## Example
Add in your activity to show dialog rate
```java
new MyRate(context, R.mipmap.ic_launcher)
    .show();
```
Change language dialog rate
```java
new MyRate(context, "Comment aimeriez-vous cette application?", R.mipmap.ic_launcher, "Merci")
    .show();
```

## About
Created by HuyHung Dinh<br>
GitHub: https://github.com/hu2di<br>
Email: hebitaxy@gmail.com
