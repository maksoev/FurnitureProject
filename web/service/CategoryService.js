class CategoryService {

    getAllCategory() {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetAllCategory', false);
        request.send();
        if (request.status === 200)
        {
            var listCategory = JSON.parse(request.responseText);
            return listCategory;
        }
        return null;
    }

    getCategoryById(id) {
        var request = new XMLHttpRequest();
        request.open('GET', '/FurnitureProject/GetCategoryById?id=' + id, false);
        request.send();
        if (request.status === 200)
        {
            var category = JSON.parse(request.responseText);
            return category;
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