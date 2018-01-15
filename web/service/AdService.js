class AdService
{

    getAllAdForCategoryId(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetCategoryById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var category = JSON.parse(request.responseText);
            return category.ad;
        }
        return null;
    }
    
    getAllAdForUserId(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetUserById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var user = JSON.parse(request.responseText);
            return user.ad;
        }
        return null;
    }

    getAdById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetAdById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var ad = JSON.parse(request.responseText);
            return ad;
        }
        return null;
    }

    insertCategory() {

    }

    updateCategory() {

    }

    deleteCategory() {

    }
}