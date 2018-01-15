class UserService {
    
    getAllUser() {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetAllUser', false);
        request.send();
        if (request.status === 200)
        {
            var listUser = JSON.parse(request.responseText);
            return listUser;
        }
        return null;
    }
    
    getUserById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetUserById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var user = JSON.parse(request.responseText);
            return user;
        }
        return null;
    }
    
}
