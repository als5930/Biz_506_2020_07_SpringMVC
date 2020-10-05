	document.addEventListener("DOMContentLoaded", function() {
		let input_btn = document.querySelector("#btn-save")
		input_btn.addEventListener("click", function() {
			document.querySelector("form").submit();
		})
	})	
