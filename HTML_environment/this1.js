const employee = {
    fistName: 'Mark',
    lastName: 'Smith', 
    getFullName: function() {
        {
        console.log(this)
        return this.firstName + ' ' + this.lastName;
    }
}
}
employee.getFullName();

let a = this;
console.log(a);