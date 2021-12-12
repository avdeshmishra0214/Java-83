let xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest()
	
	xhr.open("GET", "searchemp?eno="+empno, true) //true -- asynchronous communication	
	
	xhr.onreadystatechange = stateChangeHandling
	
	xhr.send()
}

function stateChangeHandling(){
	let ename = 'NOT FOUND'
	let esal = 'NOT FOUND'
	
	if(xhr.readyState == 4 && xhr.status == 200){		
		let responseText = xhr.responseText
		
		if(responseText.length > 0){
			let responseObject = JSON.parse(responseText)
			ename = responseObject.empname
			esal = responseObject.empsal		
		}
		
		document.getElementById("emp-name").innerText = ename
		document.getElementById("emp-sal").innerText = esal
	}
}