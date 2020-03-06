# SweetAlert
Android Sweet Alert Examples

These are simple examples from the dependent that thomper posted on their blog. Please Check it out using this link:
https://jitpack.io/p/thomper/sweet-alert-dialog

Shout out to @thomper for bringing back to life this dead project.
To Get Started Follow The Following Instructions:
<div class="row space">
        <div class="col-lg-10 col-lg-offset-2">
            <a id="download"></a>
            <!-- com.github.thomper:sweet-alert-dialog:1.4.0 -->
<div class="row">
	<div class="col-lg-10">
				<p>
					<b>Step 1.</b> Add the JitPack repository to your build file
				</p>
				<div role="tabpanel">

					<ul class="nav nav-tabs">
						<li role="presentation" class="active"><a data-toggle="tab"
							class="dep gradle" href="#gradle">gradle</a></li>
						<li role="presentation"><a class="dep maven"
							data-toggle="tab" href="#maven">maven</a></li>
						<li role="presentation"><a class="dep sbt"
                            data-toggle="tab" href="#sbt">sbt</a></li>
                         <li role="presentation"><a class="dep lein"
                            data-toggle="tab" href="#lein">leiningen</a></li>
					</ul>

					<div class="tab-content">
					      <div role="tabpanel" class="tab-pane active" id="gradle">
                              <p>Add it in your root build.gradle at the end of repositories:</p>
                            <pre class="language-css kode"><code class="language-css kode">	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}</code></pre>
                        </div>
                        
						<div role="tabpanel" class="tab-pane" id="maven">
							<pre class="language-markup kode"><code class="language-markup kode">	&lt;repositories>
		&lt;repository>
		    &lt;id>jitpack.io&lt;/id>
		    &lt;url>https://jitpack.io&lt;/url>
		&lt;/repository>
	&lt;/repositories></code></pre>
						</div>

						
						<div role="tabpanel" class="tab-pane" id="sbt">

                              <p>Add it in your build.sbt at the end of resolvers:</p>
                            <pre class="language-css kode"><code class="language-css kode"> 
    resolvers += "jitpack" at "https://jitpack.io"
        
    </code></pre>
                        </div>
                        
                        <div role="tabpanel" class="tab-pane" id="lein">

                              <p>Add it in your project.clj at the end of repositories:</p>
                            <pre class="language-css kode"><code class="language-css kode"> 
    :repositories [["jitpack" "https://jitpack.io"]]
        
    </code></pre>
                        </div>

					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-8">
								<p><b>Step 2.</b> Add the dependency</p> 
			</div>
			<div class="col-lg-2 text-right">
				<div class="dropdown" id="subprojects" style="display: none;">
					  <button class="btn btn-default dropdown-toggle" type="button" id="moduleDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
					    Subproject
					    <span class="caret"></span>
					  </button>
					  <ul class="dropdown-menu" aria-labelledby="moduleDropdown" id="modulesList">
					  </ul>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-10">

				<div role="tabpanel">
					<div class="tab-content depTabs">
					   <div role="tabpanel" class="tab-pane depTab gradle active">
                            <pre class="language-css  kode"><code id="depCodeGradle" class="language-css kode">	dependencies {
		implementation 'com.github.thomper:sweet-alert-dialog:1.4.0'
	}</code></pre>
                        </div>
                        
						<div role="tabpanel" class="tab-pane depTab maven">
							<pre class="language-markup kode"><code id="depCode" class="kode language-markup">	&lt;dependency>
	    &lt;groupId>com.github.thomper&lt;/groupId>
	    &lt;artifactId>sweet-alert-dialog&lt;/artifactId>
	    &lt;version>1.4.0&lt;/version>
	&lt;/dependency></code></pre>
						</div>

						<div role="tabpanel" class="tab-pane depTab sbt">
                            <pre class="language-css kode"><code id="depCodeSbt" class="kode language-css">
                            
    libraryDependencies += "com.github.thomper" % "sweet-alert-dialog" % "1.4.0"
        
        </code></pre>
                        </div>
                        
                        <div role="tabpanel" class="tab-pane depTab lein">
                            <pre class="language-css kode"><code id="depCodeLein" class="kode language-css">
                            
    :dependencies [[com.github.thomper/sweet-alert-dialog "1.4.0"]]
        
        </code></pre>
                        </div>
					</div>
				</div>
			</div>
</div>
        </div>
    </div>


Sweet Alert Dialog
===================
SweetAlert for Android, a beautiful and clever alert dialog

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Sweet%20Alert%20Dialog-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1065)

[中文版](https://github.com/pedant/sweet-alert-dialog/blob/master/README.zh.md)

Inspired by JavaScript [SweetAlert](http://tristanedwards.me/sweetalert)

[Demo Download](https://github.com/pedant/sweet-alert-dialog/releases/download/v1.1/sweet-alert-sample-v1.1.apk)

## ScreenShot
![image](https://github.com/pedant/sweet-alert-dialog/raw/master/change_type.gif)

## Setup
The simplest way to use SweetAlertDialog is to add the library as aar dependency to your build.

**Maven**

    <dependency>
      <groupId>cn.pedant.sweetalert</groupId>
      <artifactId>library</artifactId>
      <version>1.3</version>
      <type>aar</type>
    </dependency>

**Gradle**

    repositories {
        mavenCentral()
    }

    dependencies {
        compile 'cn.pedant.sweetalert:library:1.3'
    }

## Usage

show material progress

    SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
    pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
    pDialog.setTitleText("Loading");
    pDialog.setCancelable(false);
    pDialog.show();

![image](https://github.com/pedant/sweet-alert-dialog/raw/master/play_progress.gif)

You can customize progress bar dynamically with materialish-progress methods via **SweetAlertDialog.getProgressHelper()**:
- resetCount()
- isSpinning()
- spin()
- stopSpinning()
- getProgress()
- setProgress(float progress)
- setInstantProgress(float progress)
- getCircleRadius()
- setCircleRadius(int circleRadius)
- getBarWidth()
- setBarWidth(int barWidth)
- getBarColor()
- setBarColor(int barColor)
- getRimWidth()
- setRimWidth(int rimWidth)
- getRimColor()
- setRimColor(int rimColor)
- getSpinSpeed()
- setSpinSpeed(float spinSpeed)

thanks to the project [materialish-progress](https://github.com/pnikosis/materialish-progress) and [@croccio](https://github.com/croccio) participation.

more usages about progress, please see the sample.

A basic message：

    new SweetAlertDialog(this)
        .setTitleText("Here's a message!")
        .show();

A title with a text under：

    new SweetAlertDialog(this)
        .setTitleText("Here's a message!")
        .setContentText("It's pretty, isn't it?")
        .show();

A error message：

    new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
        .setTitleText("Oops...")
        .setContentText("Something went wrong!")
        .show();

A warning message：

    new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .show();

A success message：

    new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
        .setTitleText("Good job!")
        .setContentText("You clicked the button!")
        .show();

A message with a custom icon：

    new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
        .setTitleText("Sweet!")
        .setContentText("Here's a custom image.")
        .setCustomImage(R.drawable.custom_img)
        .show();

Bind the listener to confirm button：

    new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sDialog) {
                sDialog.dismissWithAnimation();
            }
        })
        .show();

Show the cancel button and bind listener to it：

    new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setCancelText("No,cancel plx!")
        .setConfirmText("Yes,delete it!")
        .showCancelButton(true)
        .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sDialog) {
                sDialog.cancel();
            }
        })
        .show();

**Change** the dialog style upon confirming：

    new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
        .setTitleText("Are you sure?")
        .setContentText("Won't be able to recover this file!")
        .setConfirmText("Yes,delete it!")
        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sDialog) {
                sDialog
                    .setTitleText("Deleted!")
                    .setContentText("Your imaginary file has been deleted!")
                    .setConfirmText("OK")
                    .setConfirmClickListener(null)
                    .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
            }
        })
        .show();

[more android tech shares: pedant.cn](http://www.pedant.cn)

## License

    The MIT License (MIT)

    Copyright (c) 2014 Pedant(http://pedant.cn)

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

