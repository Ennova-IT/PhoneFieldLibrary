HOWTO

Add the following public repo to the root `build.gradle`, so that all your modules can use it:

```
maven {
  url "https://api.bitbucket.org/1.0/repositories/tiwiz/maven_repository/raw/releases"
}
```

Then include it in the `build.gradle` file of the module where you need it:
```
compile 'it.ennova.phonefield:PhoneField:1.0.0'
```

The usage is pretty simple: add the `View` as a child to a `CoordinatorLayout` (this is **mandatory** as at the moment the library relies on Google's Support Library):

```xml
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <it.ennova.phonefield.view.CountryNumberView
        android:id="@+id/countryNumberView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

</android.support.design.widget.CoordinatorLayout>
```

Then, find the `View` as usual:

```java
CountryNumberView countryNumberView = ((CountryNumberView) findViewById(R.id.countryNumberView));;
```

At this point, you can simply call the `getAndroidComponent()` to get the internal `EditText` containing the number. Although this is unusual, the idea behind it is that by having full control of the `View`, you can integrate this component easily in every environment.
