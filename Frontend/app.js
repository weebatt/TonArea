window.addEventListener('load', () => {
    let daoProfilesContainer = document.getElementById('spaces-profiles-container');

    for(let i = 0; i<16; i++){
        const daoProfile = document.createElement('div');
        daoProfile.classList.add('dao-profile')
        daoProfile.innerHTML = `
            <img src="https://cdn.stamp.fyi/space/s:aave.eth?s=164&cb=306a665387fde471"/>
            <p class='members-count'>151K members</p>
            <button>Join</button>
        `;
        daoProfilesContainer.appendChild(daoProfile);
    }
    const tc_widgets = document.createElement('tc-widget-root');
    const inner_tc_widgets = tc_widgets.innerHTML;

    const useless_widgets = document.getElementById('useless-widgets');
    useless_widgets.innerHTML = inner_tc_widgets;
    
    tc_widgets.remove();
});