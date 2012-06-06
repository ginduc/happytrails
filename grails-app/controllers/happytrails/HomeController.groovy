package happytrails

class HomeController {

    def index() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [regions: Region.list(params), total: Region.count()]
    }
}
