# CoreTuxEngineering
Usefull scripts and programs I learned and know


You have to open that file with a text editor and then save it.

touch ~/.bash_profile; open ~/.bash_profile
It will open the file with TextEdit, paste your things and then save it. If you open it again you'll find your edits.

You can use other editors:

nano ~/.bash_profile
mate ~/.bash_profile
vim ~/.bash_profile
But if you don't know how to use them, it's easier to use the open approach.

Alternatively, you can rely on pbpaste. Copy

export ANDROID_HOME=/<installation location>/android-sdk-macosx
export PATH=${PATH}:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
in the system clipboard and then in a shell run

pbpaste > ~/.bash_profile
Or alternatively you can also use cat

cat > ~/.bash_profile
