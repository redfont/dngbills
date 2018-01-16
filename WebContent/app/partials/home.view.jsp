<div>
	<div>D&G Bills Payment</div>
	
	<table>
		<tr ng-repeat="s in vm.serviceTypeCompanies">
			<td>
				<ul>{{s.serviceTypeDto.serviceTypeName}}
					<li ng-repeat="c in s.companyInfoDto" style="list-style: none;"><a href="" ng-click="vm.test()">{{c.companyName}}</a></li>
				</ul>
			</td>
		</tr>
	</table>
	
</div>