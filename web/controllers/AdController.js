class AdController {

    constructor() {
        this.adService = new AdService();
    }

    getAllAdByCategoryId(id) {
        return this.adService.getAllAdForCategoryId(id);
    }

    getAllAdForCategoryView(id, oneTime) {
        var ad = this.getAllAdByCategoryId(id);
        var element = document.getElementById("ad");
        var html = "";
        console.log(ad);
        for (var i = 0; i < ad.length; i++) {
            var datepost = new Date(ad[i].datepost);
            var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                weekday: 'long',
                hour: 'numeric',
                minute: 'numeric'
            };
            datepost = datepost.toLocaleString("ru", options);

            var imageText = "";
            imageText = "<img  class='img-responsive' src='data:image/jpeg;base64," + ad[i].image + "'>";

            html += "<div class='jumbotron' onclick='adClicked(" + ad[i].id + ")' >" +
                    imageText +
                    "<h2> " + ad[i].name + "</h2>" +
                    "<br><b>Описание: </b> <br>" +
                    "<hp> " + ad[i].description + "</p>" +
                    "<b>Цена: </b>" + ad[i].price + " руб. <br>" +
                    "<b>Кто добавил:</b>" + ad[i].user.name + "<br>" +
                    "<b>Местоположение:</b>" + ad[i].city + "<br>" +
                    "<p align='right'>" + datepost + "</p>" +
                    "</div>";
        }
        if (oneTime)
            element.innerHTML = "";
        element.innerHTML += html;
    }

    getAllAdForUserId(id) {
        return this.adService.getAllAdForUserId(id);
    }

    getAllAdForUserIdView(id, oneTime) {
        var ad = this.getAllAdForUserId(id);
        var element = document.getElementById("ad");
        var html = "";
        console.log(ad);
        for (var i = 0; i < ad.length; i++) {
            var datepost = new Date(ad[i].datepost);
            var options = {
                year: 'numeric',
                month: 'long',
                day: 'numeric',
                weekday: 'long',
                hour: 'numeric',
                minute: 'numeric'
            };
            datepost = datepost.toLocaleString("ru", options);

            var imageText = "";

            imageText = "<img  class='img-responsive' src='data:image/jpeg;base64," + ad[i].image + "'>";

            html += "<div class='jumbotron' onclick='adClicked(" + ad[i].id + ")' >" +
                    imageText +
                    "<h2> " + ad[i].name + "</h2>" +
                    "<br><b>Описание: </b> <br>" +
                    "<hp>Описание: " + ad[i].description + "</p>" +
                    "<b>Цена: </b>" + ad[i].price + " руб. <br>" +
                    "<b>Кто добавил:</b>" + ad[i].user.name + "<br>" +
                    "<b>Местоположение:</b>" + ad[i].city + "<br>" +
                    "<p align='right'>" + datepost + "</p>" +
                    "</div>";
        }
        if (oneTime)
            element.innerHTML = "";
        element.innerHTML += html;
    }

    getAdById(id) {
        return this.adService.getAdById(id);
    }

    getAdByIdView(id) {
        var ad = this.getAdById(id);
        var element = document.getElementById("ad");
        var html = "";
        console.log(ad);
        var datepost = new Date(ad.datepost);
        var options = {
            year: 'numeric',
            month: 'long',
            day: 'numeric',
            weekday: 'long',
            hour: 'numeric',
            minute: 'numeric'
        };
        datepost = datepost.toLocaleString("ru", options);

        var imageText = "";
        
        imageText = "<img  class='img-responsive' src='data:image/jpeg;base64," + ad.image + "'>";

        html += "<div class='jumbotron' onclick='adClicked(" + ad.id + ")' >" +
                imageText +
                "<h2> " + ad.name + "</h2>" +
                "<br><b>Описание: </b> <br>" +
                "<hp>Описание: " + ad.description + "</p>" +
                "<b>Цена: </b>" + ad.price + " руб. <br>" +
                "<b>Местоположение:</b>" + ad.city + "<br>" +
                "<p align='right'>" + datepost + "</p>" +
                "</div>";

        element.innerHTML += html;
    }

    getShortAdByIdView(id) {
        var ad = this.getAdById(id);

        $("#InputAd").val(ad.name);
        $("#InputAdDescription").val(ad.description);
        $("#InputAdPrice").val(ad.price);
        $("#InputAdCity").val(ad.city);
        $("#userList").val(ad.user_id);
        $("#categoryList").val(ad.category_id);
    }
}
