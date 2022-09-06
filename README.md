# 🔐 Password Encryptor

Do you ever wonder, how the passwords that you set to any website or app is kept safely by them so that no hacker can crack it and snoop into your account? 

Well its the subtle art of encrypting the passwords that makes it from 'readable & understandable' to just 'readable' and not understandable by human eye.

>Check out the video demonstration of the [Password Encryptor](https://youtu.be/cH7YrNXYwts).

## 🔑 XOR Cipher

This cipher technique applies the XOR operation on the input value and the output we get is treated as an encrypted form of the input since its completely different from the original value.

> In order to test the code, just run the **Main.java** file and make sure that **PasswordManager.java** is placed in the **same directory as of Main.java**.

### Working of the XOR cipher for the Password Encryptor
>1. Each character of the input password is first parsed to its equivalent ASCII code.
>2. The parsed character is then performed upon a XOR operator to its position value in the string count beginning at zero.
>    - **val** = char[**X**] ^ **X**
>3. **val** is then again parsed back to its character equivalent and thus it is encrypted.
