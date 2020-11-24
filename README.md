# aws-getaccountid-example
An example of how to get the AWS account id of the current account in an application.

## Running the Example
Follow the steps below to run the example:

1. Ensure you have AWS credentials configured in the `~/.aws/credentials` file.

2. Run the following command to execute the application:

        ./gradlew clean build run
    
    If successful, you will see a response similar to the following below:

        > Task :run
        [main] INFO example.Application - Account Id: 999999999999
        [main] INFO example.Application - Caller Id: ARSTTBX7F3F7B47PQW7A6:foo.bar@foobar.com
        [main] INFO example.Application - Caller Arn: arn:aws:sts::999999999999:assumed-role/iamr-foo-domain/foo.bar@foobar.com

## Bugs and Feedback
For bugs, questions, feedback, and discussions please use the [Github Issues](https://github.com/gregwhitaker/aws-getaccountid-example/issues).

## License
MIT License

Copyright (c) 2020 Greg Whitaker

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