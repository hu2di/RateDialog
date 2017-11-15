### RateDialog
The android library show dialog rate on app and on Google Play Store

### Screenshot
<img src="https://raw.githubusercontent.com/hu2di/RateDialog/master/screenshot.png">

### SDK Support
Support from SDK version 14 onwards

### Download
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
    compile 'com.github.hu2di:RateDialog:1.0.3'
}
```

### Example
Add in your activity to show dialog rate
```java
new MyRate(context, 
	new RateListener() {
                    @Override
                    public void oneStar() {                        
                    }

                    @Override
                    public void twoStars() {                        
                    }

                    @Override
                    public void threeStars() {                        
                    }

                    @Override
                    public void fourStars() {                        
                    }

                    @Override
                    public void fiveStars() {                        
                    }
                },
	R.mipmap.ic_launcher)
    .show();
```
Change language dialog rate
```java
new MyRate(context, 
	new RateListener() {
                    @Override
                    public void oneStar() {                       
                    }

                    @Override
                    public void twoStars() {                      
                    }

                    @Override
                    public void threeStars() {                        
                    }

                    @Override
                    public void fourStars() {                        
                    }

                    @Override
                    public void fiveStars() {                    
                    }
                },
	"Comment aimeriez-vous cette application?", 
	R.mipmap.ic_launcher, 
	"Merci")
    .show();
```

### About
- Created by HuyHung Dinh
- GitHub: https://github.com/hu2di
- Email: hebitaxy@gmail.com
- Donate: [**paypal.me/hungdh**](https://www.paypal.me/hungdh)
