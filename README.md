# Voice-mail-system-
This is an voice mail system of android based using google voice recognization API
We will design and implement a program that simulates a voice mail system, without creating a completely realistic working phone system. We will simply represent voice mail by text that is entered through the keyboard. We need to simulate the three distinct input events that occur in a real telephone system: speaking, pushing a button on telephone touchpad, and hanging up the telephone. We use the following convention for input: An input line consisting of a single character 1....9 or # denotes a pressed button on the telephone touchpad. For example, to dial extension 13, you enter 1 3 #
An input line consisting of the single letter H denotes hanging up the telephone. Any other text denotes voice input.
Your system should provide the following functions at least: 1) Reach an extension 2) Leave a message 3) Log in 4) Retrieve message 5) Change the Greeting 6) Change the Passcode.
#Project-based
Based on this secenario we implement Enter Extension usecase. In this project Enter extension workflow is Caller a Actor and Caller click the button then open Google voice API. Then speak whatever you need.If the voice is not heare the  system they another catch that and send message can't heare ,speak again. When Voice detection then auto type message and send to the default given mail. Sender mail must be signin into the device.Then click send button.
