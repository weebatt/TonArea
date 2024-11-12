document.addEventListener('DOMContentLoaded', () => {
    const searchInput = document.getElementById('search-input');
    const daoProfilesContainer = document.getElementById('spaces-profiles-container');
    const paginationContainer = document.getElementById('pagination-container');
    let currentPage = 0;
    const pageSize = 10;

    async function fetchOrganizations(query = '', page = 0) {
        try {
            const url = query
                ? `/api/organizations?name=${query}&page=${page}&size=${pageSize}`
                : `/api/organizations?page=${page}&size=${pageSize}`;

            const response = await fetch(url);
            const data = await response.json();
            renderOrganizations(data.content);
            renderPagination(data);
        } catch (error) {
            console.error('Error fetching organizations:', error);
        }
    }

    function renderOrganizations(organizations) {
        daoProfilesContainer.innerHTML = '';

        organizations.forEach(org => {
            const daoProfile = document.createElement('div');
            daoProfile.classList.add('dao-profile');
            daoProfile.innerHTML = `
                <img src="https://cdn.stamp.fyi/space/s:aave.eth?s=164&cb=306a665387fde471" alt="${org.name}"/>
                <p class='members-count'>${org.memberCount} members</p>
                <button>Join</button>
            `;
            daoProfilesContainer.appendChild(daoProfile);
        });
    }

    function renderPagination(data) {
        paginationContainer.innerHTML = '';
        paginationContainer.classList.add('pagination-container');

        for (let i = 0; i < data.totalPages; i++) {
            const pageButton = document.createElement('button');
            pageButton.textContent = i + 1;
            pageButton.classList.add('page-button');
            if (i === data.number) pageButton.classList.add('active');
            pageButton.addEventListener('click', () => fetchOrganizations(searchInput.value, i));
            paginationContainer.appendChild(pageButton);
        }
    }

    searchInput.addEventListener('input', () => {
        currentPage = 0;
        const query = searchInput.value.trim();
        fetchOrganizations(query, currentPage);
    });

    fetchOrganizations();
});
