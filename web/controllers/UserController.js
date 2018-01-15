class UserController
{
    constructor() {
        this.userService = new UserService();
    }
     getAllUser() {
        return this.userService.getAllUser();
    }
     getAllUserViewListGroup() {
        var list = this.getAllUser();
        var element = document.getElementById("user");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<a onclick ='userClicked(" + list[i].id + ")' class='list-group-item'>" + list[i].name + "</a>";
        }
        element.innerHTML = html;
        return list.map(item => item.id);
    }
    getAllUserViewListGroupListBox() {
        var list = this.getAllUser();
        var element = document.getElementById("userList");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<option id='InputAdUser' value='" + list[i].id + "'>" + list[i].name + "</option>";
        }
        element.innerHTML = html;
        return list.length;
        
    }
    getUserById(id) {
        return this.userService.getUserById(id);
    }
    getAllUserViewListButton() {
        var list = this.getAllUser();
        var element = document.getElementById("user");
        var html = "";
        for (var i = 0; i < list.length; i++) {
            html += "<div onclick ='userClicked(" + list[i].id + ")' \n\
                    class='btn btn-success'>" + list[i].name + "</div>";
        }
        element.innerHTML = html;
    }

}