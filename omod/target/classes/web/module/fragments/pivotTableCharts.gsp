<div>
	<table>
	    <tr>
	        <th>Capital City</th>
	        <th>Total Population</th>
	        <th>Safety Assessment</th>
	        <th>Average Age</th>
	    </tr>
	    <% if (CityObjects) { %>
	        <% CityObjects.each { %>
	            <tr>
	                <td>${ ui.format(it.name) }</td>
	                <td>${ ui.format(it.population) }</td>
	                <td>${ ui.format(it.safety) }</td>
	                <td>${ ui.format(it.averageAge) }</td>
	            </tr>
	        <% } %>
	    <% } else { %>
	        <tr>
	            <td colspan="4">No City objects Found</td>
	        </tr>
	    <% } %>
	</table>
</div>