# pictureverification
安卓中的图片验证码控件

## 导入方法：
### 1.Gradle：
          compile 'com.againstsky:vcode:1.0.1'
### 2.Maven:
          <dependency>
           <groupId>com.againstsky</groupId>
           <artifactId>vcode</artifactId>
           <version>1.0.1</version>
           <type>pom</type>
          </dependency>

## 使用方法，在layout中如下形式：
 <com.againstsky.verificationcode.VerificationCodeView
        android:id="@+id/code_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:codeMode="2"
        app:codeQuantity="6"/>
 

