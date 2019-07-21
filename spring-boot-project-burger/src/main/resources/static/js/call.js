function productList() {
	// Call Web API to get a list of Product
	$.ajax({
		url : '/orders/orders', //Bind the backend data with the front end
		type : 'GET',
		dataType : 'json',
		success : function(burgerList) {
			productListSuccess(burgerList);
		}
	});
}

function productListSuccess(burgerList) {
	// Iterate over the collection of data
	$.each(burgerList, function(index, product) {
		// Add a row to the Product table
		productAddRow(product);
	});
}

function productAddRow(product) {
	// Will Check if <tbody> tag exists, add one if not
	if ($("#productTable tbody").length == 0) {
		$("#productTable").append("<tbody></tbody>");
	}
	// Append row to <table>
	$("#productTable tbody").append(productBuildTableRow(product));
}

function productBuildTableRow(product) {
    var ret = "<tr>" + "<td>" + product.id + "</td>"
					 + "<td>" + product.name + "</td>" 
					 + "<td>" + product.price + "</td>" 
					 + "<td>" + product.qty + "</td>" 
					 + "<td>" + product.total + "</td>" 
			  + "</tr>";
    return ret;
}
