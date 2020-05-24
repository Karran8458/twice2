function twice(arr)
{
	var arr2 = [arr.length*2];
	var j = 0;
	for (var i = 0; i < arr.length; i++)
	{
		arr2[j]=arr[i];
		arr2[j+1]=arr[i];
		j=j+2;
	}
	return arr2;
}
