	var inputContent = "";
	var input;
	input=document.getElementsByTagName("input");

	function setInputContent(text){
		input[0].value=text;
		inputContent=text;
	}

	function checkInput()
		{

			inputContent = input[0].value;

				switch(input[0].value)
				{
					case "kupa":
					input[0].style.color="red";
					break;
				}

			}