function  attendence {

	x=$((RANDOM%2))
	if [[ $x -eq 1 ]]
	then 
		echo "Employee is Present"
		return 1
	else
		echo "Employee is Absent"
		return 2
	fi
}

attendence 
n=$?