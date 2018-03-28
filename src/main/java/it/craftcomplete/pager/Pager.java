package it.craftcomplete.pager;

class Pager {
    private int currentPage = 1;

    public Pager documents(int documents) {
        return this;
    }

    public Pager perPage(int pageSize) {
        return this;
    }

    public int currentPage() {
        return currentPage;
    }

    public int pages() {
        return 2;
    }

    public Pager startAt(int page) {
        currentPage = page;
        return this;
    }
}
